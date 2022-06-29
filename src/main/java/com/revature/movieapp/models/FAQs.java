package com.revature.movieapp.models;


import javax.persistence.*;

@Entity
@Table(schema = "Movie_DB", name ="faqs")
public class FAQs {

    @Id
    @GeneratedValue
    private int id;
    @Column(name ="faq_question")
    private String faq_question;

    @Column(name = "faq_question")
    private String faq_answer;


    public FAQs() {
        super();
    }

    public FAQs(int id, String faq_question, String faq_answer) {
        super();
        this.id = id;
        this.faq_question = faq_question;
        this.faq_answer = faq_answer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", faq_question='" + faq_question + '\'' +
                ", faq_answer='" + faq_answer + '\'' +
                '}';
    }

}
