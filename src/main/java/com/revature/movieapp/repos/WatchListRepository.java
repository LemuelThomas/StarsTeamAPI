package com.revature.movieapp.repos;

import com.revature.movieapp.models.WatchList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchListRepository extends JpaRepository<WatchList, Integer> {
}
