import com.revature.movieapp.models.FAQs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class FAQsControllerTest {

    @Autowired
    TestRestTemplate testRestTemplate;
@Test
    public void createFAQ_WhenFAQ_IsValid_recieve_OK(){
    FAQs faQs = new FAQs();
    faQs.setFaq_question("What are the");
    faQs.setFaq_answer("I do not know");
    final ResponseEntity<Object> response = testRestTemplate.postForEntity("/faqs", faQs, Object.class);


}
}
