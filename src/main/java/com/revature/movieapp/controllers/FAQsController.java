
package com.revature.movieapp.controllers;

import com.revature.movieapp.models.FAQs;
import com.revature.movieapp.repos.FAQs_Repo;
import com.revature.movieapp.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.revature.movieapp.services.FAQs_Service;

import java.util.List;


@RestController
@RequestMapping()
public class FAQsController {

    @Autowired
    FAQs_Service faQs_service;
    @Autowired
    FAQs_Repo faQs_repo;

    @DeleteMapping("/api/1.0/faqs")
    GenericResponse DeleteFAQS() {
        faQs_service.cleanup();
        return new GenericResponse("FAQs Deleted");


    }

    @GetMapping("/api/1.0/faqs")
    List<FAQs> getFaqs() {
        return faQs_repo.getFAQs();

    }

    @PostMapping("/api/1.0/faqs")
    GenericResponse createFAQs() {

        faQs_service.createRandomFAQs();
        return new GenericResponse("FAQs Saved");


    }


}

