package com.revature.movieapp.repos;

import com.revature.movieapp.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
    List<Genre> findByIdIn(List<Integer> genreId);
}
