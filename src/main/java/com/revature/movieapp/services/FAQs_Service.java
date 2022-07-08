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
        FAQs faQs = new FAQs("When is Spider-man coming out?", "SpiderMan comes out every season like clockwork.");
        FAQs faQs_1 = new FAQs("What time are do you close?", "This is a streaming service. We are open 24/7.");
        FAQs faQs_2 = new FAQs("Do you guys deliver popcorn? ", "Sorry, we don't deliver popcorn.");
        FAQs faQs_3 = new FAQs("How much does each movie cost?", "The cost of each movie depends on several things.");
        FAQs faQs_4 = new FAQs("How much does live streaming cost?", "All streamed shows are free except for exclusive events.");
        FAQs faQs_5 = new FAQs("Can I get a refund if I purchase a movie?", "We do not offer refunds.");
        FAQs faQs_6 = new FAQs("What sort of movie options are there?", "We have movies and shows for all ages");
        FAQs faQs_7 = new FAQs("When can we buy tickets to see the latest release?", "Duh,I don't know?");
        FAQs faQs_8 = new FAQs("Are you guys hiring anytime soon?", "Sure, we're always hiring!");
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
