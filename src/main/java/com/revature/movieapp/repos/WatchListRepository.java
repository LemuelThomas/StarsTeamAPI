package com.revature.movieapp.repos;

import com.revature.movieapp.dto.VideoTypeRequest;
import com.revature.movieapp.models.VideoType;
import com.revature.movieapp.models.WatchList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WatchListRepository extends JpaRepository<WatchList, Integer> {

    List<WatchList> findTop10ByUserIdAndTypeOrderByIdDesc(int userId, VideoType type);

    Optional<WatchList> findByUserIdAndTypeAndVideoId(int userId, VideoType type, int videoId);
}
