

package com.revature.movieapp.repos;

import com.revature.movieapp.models.FAQs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FAQs_Repo extends JpaRepository<FAQs, Integer> {
  @Query(nativeQuery = true, value = "SELECT * FROM faq")
  List<FAQs> getFAQs();
}



