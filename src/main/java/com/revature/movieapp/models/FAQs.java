
package com.revature.movieapp.models;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
@Table(name = "faq")
public class FAQs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int faq_id;
    @Column(name = "question")
    private String faq_question;

    @Column(name = "answer")
    private String faq_answer;

    public FAQs() {
    }

    public FAQs(int i, String s, String s1) {
        this.faq_id = i;
        this.faq_question = s;
        this.faq_answer = s1;
    }

    public FAQs(String s, String s1) {
        this.faq_question = s;
        this.faq_answer = s1;
    }
}


