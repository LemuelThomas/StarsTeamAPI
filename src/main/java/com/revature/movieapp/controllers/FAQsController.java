package com.revature.movieapp.controllers;

import com.revature.movieapp.models.FAQs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faqs")
public class FAQsController {
public FAQs faQs = new FAQs();
    @GetMapping
    public String sanity(){
        return "/This is a test.Q";
    }


 public String GetFAQs(FAQs resp){this.faQs = resp; return resp.toString(); }
}
