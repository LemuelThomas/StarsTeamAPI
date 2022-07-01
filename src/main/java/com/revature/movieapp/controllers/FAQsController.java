package com.revature.movieapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faq")
public class FAQsController
{
    @Value("${spring.datasource.url}")
    private String greeting;
    @GetMapping()
 public String GetFAQs(){return greeting;}


}
