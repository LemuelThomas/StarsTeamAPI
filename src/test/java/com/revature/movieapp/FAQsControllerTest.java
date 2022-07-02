package com.revature.movieapp;
import com.revature.movieapp.models.FAQs;
import com.revature.movieapp.repos.FAQs_Repo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class FAQsControllerTest {

    public static final String URL = "/faqs";
    @Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    FAQs_Repo faQs_repo;
@Test
    public void postFAQ_WhenFAQ_IsValid_createFAQ_WhenFAQ_IsValid_receive_OK(){
    FAQs faQs = createFaQs();
    final ResponseEntity<Object> response = testRestTemplate.postForEntity(URL, faQs, Object.class);
    //assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    // Assert.assertEquals(faQs.toString(),faQs.toString());
}

    private FAQs createFaQs() {
        FAQs faQs = new FAQs();
        faQs.setFaq_question("What are the keys to the universe?");
        faQs.setFaq_answer("I do not know");
        return faQs;
    }

    @Test
    public void postFAQ_WhenFAQ_IsValid_faqSavedToDatabase(){
    FAQs faQs = createFaQs();
        testRestTemplate.postForEntity(URL, faQs, Object.class);
        Assert.assertEquals(faQs_repo.count(),faQs_repo.equals(1));

    }
}
