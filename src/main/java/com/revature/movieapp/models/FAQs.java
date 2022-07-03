package com.revature.movieapp.models;
import lombok.*;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
@Entity
@Table(name = "faq")
public class FAQs
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int faq_id;
    @Column(name = "question")
    private String faq_question;

    @Column(name = "answer")
    private String faq_answer;

}
