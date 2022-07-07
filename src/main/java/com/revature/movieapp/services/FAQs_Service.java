package com.revature.movieapp.services;

import com.revature.movieapp.models.FAQs;
import com.revature.movieapp.repos.FAQs_Repo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FAQs_Service {
    FAQs_Repo faQs_repo;

    public FAQs_Service(FAQs_Repo faQs_repo) {
        super();
        this.faQs_repo = faQs_repo;
    }


    public void createRandomFAQs() {
        FAQs faQs = new FAQs("When is Spider-man coming out?", "Duh,I don't know?");
        FAQs faQs_1 = new FAQs("What time are do you close?", "Duh,I don't know?");
        FAQs faQs_2 = new FAQs("Do you guys deliver popcorn? ", "Duh,I don't know?");
        FAQs faQs_3 = new FAQs("How much does each movie cost?", "Duh,I don't know?");
        FAQs faQs_4 = new FAQs("How much does live streaming cost?", "Duh,I don't know?");
        FAQs faQs_5 = new FAQs("Can I get a refund if I purchase a movie?", "Duh,I don't know?");
        FAQs faQs_6 = new FAQs("What sort of movie options are there?", "Duh,I don't know?");
        FAQs faQs_7 = new FAQs("When can we buy tickets to see the latest release?", "Duh,I don't know?");
        FAQs faQs_8 = new FAQs("Are you guys hiring anytime soon?", "Duh,I don't know?");
        List<FAQs> randomfaqs = new ArrayList<>();

        randomfaqs.add(faQs);
        randomfaqs.add(faQs_1);
        randomfaqs.add(faQs_2);
        randomfaqs.add(faQs_3);
        randomfaqs.add(faQs_4);
        randomfaqs.add(faQs_5);
        randomfaqs.add(faQs_6);
        randomfaqs.add(faQs_7);
        randomfaqs.add(faQs_8);

        for (FAQs f : randomfaqs) {
            saveFAQ(f);
        }

    }

    public FAQs saveFAQ(FAQs faQs) {
        return faQs_repo.save(faQs);
    }


    public void cleanup() {
        faQs_repo.deleteAll();
    }

    public void getFaqs(){
        faQs_repo.getFAQs();
    }
}
