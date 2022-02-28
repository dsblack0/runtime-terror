package com.example.sping_portfolio.controllers.database.Club;

import com.example.sping_portfolio.Main;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter
@Getter
@ToString
@Entity
//@RequiredArgsConstructor
@Table(name="clubs")
public class Club {
    @Id
    @GeneratedValue()
    private Long id;

    @NonNull
    @Size(min = 2, max = 30, message = "Name (2-30 characters)")
    private String clubname;

    @NonNull
    @Size(min = 2, max = 30, message = "President (2-30 characters)")
    private String president;

    @NonNull
    @Size(min = 2, max = 30, message = "Member Count (2-30 characters)")
    private int memberCount;

    @NonNull
    @Size(min = 2, max = 30, message = "About Club (2-30 characters)")
    private String aboutclub;

    @NonNull
    @Size(min = 2, max = 30, message = "Club Links (2-30 characters)")
    private String clublinks;



    public Club(){

    }
    public Club(String name, String president, int memberCount, String aboutclub, String clublinks){
        this.president = president;
        this.memberCount = memberCount;
        this.clubname = name;
        this.aboutclub = aboutclub;
        this.clublinks = clublinks;

    }

//    public int getMemberCount(){
//        if(this.memberCount != null){
//            //modify date code to this case
//        }
//    }
    public void setPresident(String name){
        this.president = name;
    }
    public void setMemberCount(int memebercount){
        this.memberCount = memebercount;
    }
    public void setClubName(String clubname){
        this.clubname = clubname;
    }
    public void setAboutClub(String aboutclub){
        this.aboutclub = aboutclub;
    }
    public void setClubLinks(String clublinks){
        this.clublinks = clublinks;
    }
}
