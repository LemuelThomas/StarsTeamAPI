package com.revature.movieapp;

import com.revature.movieapp.models.FAQs;
import com.revature.movieapp.repos.FAQs_Repo;
import com.revature.movieapp.shared.GenericResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class FAQsControllerTest {

    public static final String URL = "/api/1.0/faqs";
    @Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    FAQs_Repo faQs_repo;

    @Before
    public void cleanup() {
        faQs_repo.deleteAll();
    }

    @Test
    public void postFAQ_WhenFAQ_IsValid_Receive_OK() {
        FAQs faQs = createFaQs();
        final ResponseEntity<Object> response = testRestTemplate.postForEntity(URL, faQs, Object.class);
        if (response.getStatusCode() == HttpStatus.OK) {

            System.out.println("Response Body is =>  " + response);
        }

    }


    private FAQs createFaQs() {
        FAQs faQs = new FAQs();
        faQs.setFaq_question(" ");
        faQs.setFaq_answer(" ");
        return faQs;
    }

    public void postFAQ_WhenFAQ_IsValid_receive_SuccessMessage() {
        FAQs faQs = createFaQs();
        final ResponseEntity<GenericResponse> response = testRestTemplate.postForEntity(URL, faQs, GenericResponse.class);
        if (response.getStatusCode() == HttpStatus.OK) {

            System.out.println("Response Body is =>  " + response);
        }
    }

    @Test
    public void postFAQ_WhenFAQ_IsValid_faqSavedToDatabase() {
        FAQs faQs = createFaQs();
        testRestTemplate.postForEntity(URL, faQs, Object.class);
        if (faQs_repo.count() > 0) ;
        {

            System.out.println("Response Body is =>  " + faQs);
            System.out.println("Number of FAQs in database: =>  " + faQs_repo.count());
        }
    }

}

