package com.revature.movieapp.models;


import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
@Table( name ="faq")
public class FAQs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int faq_id;
    @Column(name ="question")
    private String faq_question;

    @Column(name = "answer")
    private String faq_answer;


    public FAQs() {
        super();
    }

    public FAQs(int id, String faq_question, String faq_answer) {
        super();
        this.faq_id = id;
        this.faq_question = faq_question;
        this.faq_answer = faq_answer;
    }


    public int getId() {
        return faq_id;
    }

    public void setId(int id) {
        this.faq_id = id;
    }

    public String getFaq_question() {
        return faq_question;
    }

    public void setFaq_question(String faq_question) {
        this.faq_question = faq_question;
    }

    public String getFaq_answer() {
        return faq_answer;
    }

    public void setFaq_answer(String faq_answer) {
        this.faq_answer = faq_answer;
    }
    @Override
    public String toString() {
        return "FAQs{" +
                "id=" + faq_id +
                ", faq_question='" + faq_question + '\'' +
                ", faq_answer='" + faq_answer + '\'' +
                '}';
    }

}
