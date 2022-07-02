package com.revature.movieapp.repos;

import com.revature.movieapp.models.FAQs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FAQs_Repo extends JpaRepository<FAQs,Long> {
    //This is also referred to as a Data-Access-Object.
           }


