package com.example.sping_portfolio.controllers.database.Club;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@RequiredArgsConstructor

public class Club {
    @Id
    @GeneratedValue()
    private Long id;

    @NonNull
    @Size(min = 2, max = 30, message = "Name (2-30 characters)")
    private String name;

    @NonNull
    @Size(min = 2, max = 30, message = "President (2-30 characters)")
    private String president;

    @NonNull
    @Size(min = 2, max = 30, message = "Member Count (2-30 characters)")
    private int memberCount;


    public Club(String name, String president, int memberCount){
        this.name = name;
        this.president = president;
        this.memberCount = memberCount;
    }

//    public int getMemberCount(){
//        if(this.memberCount != null){
//            //modify date code to this case
//        }
//    }
}
