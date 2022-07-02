package com.revature.movieapp.controllers;

import com.revature.movieapp.models.FAQs;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;
import services.FAQs_Service;

@RestController
@RequestMapping("/faqs")
public class FAQsController
{
FAQs_Service faQs_service;
    //private String faQs;
    @GetMapping()
 public String GetFAQs(){return null;}

@PostMapping()
    void createFAQs(@RequestBody FAQs faQs){
        faQs_service.saveFAQ(faQs);

}

}
