package services;


import com.revature.movieapp.repos.FAQs_Repo;
import org.springframework.stereotype.Service;

@Service
public class FAQs_Service {
    private final FAQs_Repo faQs_repo;

    public FAQs_Service(FAQs_Repo faQs_repo) {
        this.faQs_repo = faQs_repo;
    }
}
