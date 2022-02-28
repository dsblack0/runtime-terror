/* package com.example.sping_portfolio.controllers.database.Reviews;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
//@RequiredArgsConstructor

public class Reviews {
    @Id
    @GeneratedValue()
    private Long id;

    @NonNull
    @Size(min = 2, max = 30, message = "Name (2-30 characters)")
    private String name;

    @NonNull
    @Size(min = 2, message = "Reviews (2-30 characters)")
    private String review;

    @Size(min = 2, max = 30, message = "Reviewer Name (2-30 characters)")
    private String author;


    public Reviews(String name, String review, String author){
        this.name = name;
        this.review = review;
        this.author = author;
    }

} */
