package com.example.sping_portfolio.controllers.database;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@RequiredArgsConstructor

public class Club {
    @Id
    @GeneratedValue()

    public Club(String name, String president, int memberCount){
        this.name = name;
        this.president = president;
        this.memberCount = memberCount;
    }

    public int getMemberCount(){

    }
}
