package com.example.sping_portfolio.controllers.database.Club;

//import com.nighthawk.csa.database.scrum.ScrumSqlRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional //ask mr m abt these two
public class ClubSqlRepository {
    private ClubJpaRepository jpa;

    public List<Club>listAll(){
        return jpa.findAll();

    }

    public void save(Club club) {
        jpa.save(club);
    }

//    public Club get(long id){
//        return (jpa.findById(id).isPresent())
//                ? jpa.findById(id.get())
//                : null;
//    }

    public void delete(long id) {
        jpa.deleteById(id);
    }
}

