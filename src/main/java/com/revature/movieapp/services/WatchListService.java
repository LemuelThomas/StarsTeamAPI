package com.revature.movieapp.services;

import com.revature.movieapp.dto.NewWatchListRequest;
import com.revature.movieapp.dto.WatchListResponse;
import com.revature.movieapp.models.VideoType;
import com.revature.movieapp.models.WatchList;
import com.revature.movieapp.repos.GenreRepository;
import com.revature.movieapp.repos.WatchListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class WatchListService {

    private final GenreRepository genreRepository;
    private final WatchListRepository watchListRepository;
    private final VideoType movieType = new VideoType(1,"Movie");

    @Autowired
    public WatchListService(WatchListRepository watchListRepository, GenreRepository genreRepository) {
        this.watchListRepository = watchListRepository;
        this.genreRepository = genreRepository;
    }

    public List<WatchListResponse> getMovieWatchList(int userId) {

        return watchListRepository.findTop10ByUserIdAndTypeOrderByIdDesc(userId,movieType)
                .stream()
                .map(WatchListResponse::new)
                .collect(Collectors.toList());
    }

    public WatchListResponse checkWatchListExists(@Valid NewWatchListRequest check) {

        VideoType vt = new VideoType(check.getType().getId(), check.getType().getName());

        return watchListRepository.findByUserIdAndTypeAndVideoId(check.getUserId(), vt, check.getVideo())
                .map(WatchListResponse::new)
                .orElse(null);
    }

    public WatchListResponse createNewMovieWatchList(@Valid NewWatchListRequest newWatchList) {

        WatchListResponse check = checkWatchListExists(newWatchList);

        if (check == null) {
            WatchList wl = new WatchList();
            wl.setUserId(newWatchList.getUserId());
            wl.setVideoId(newWatchList.getVideo());
            wl.setType(movieType);
            wl.setGenre(genreRepository.findByIdIn(newWatchList.getGenre()));
            wl.setId(null);
            return new WatchListResponse(watchListRepository.save(wl));
        } else {
            return check;
        }
    }

}
