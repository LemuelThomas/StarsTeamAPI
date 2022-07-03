package com.revature.movieapp.services;


import com.revature.movieapp.models.FAQs;
import com.revature.movieapp.repos.FAQs_Repo;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.stereotype.Service;

@Service
public class FAQs_Service {
    FAQs_Repo faQs_repo;

    public FAQs_Service(FAQs_Repo faQs_repo) {
        super();
        this.faQs_repo = faQs_repo;
    }

    public FAQs saveFAQ(FAQs faQs){
        return faQs_repo.save(faQs);
    }
}
