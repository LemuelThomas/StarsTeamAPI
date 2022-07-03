package com.revature.movieapp.controllers;

import com.revature.movieapp.models.FAQs;
import com.revature.movieapp.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.revature.movieapp.services.FAQs_Service;

@RestController
@RequestMapping()
public class FAQsController
{

    @Autowired
    FAQs_Service faQs_service;

 @PostMapping("/api/1.0/faqs")
 GenericResponse createFAQs(@RequestBody FAQs faQs){
        faQs_service.saveFAQ(faQs);
        return new GenericResponse("FAQ Saved");



}

}
