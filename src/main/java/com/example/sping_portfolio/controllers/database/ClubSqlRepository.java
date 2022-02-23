package com.example.sping_portfolio.controllers.database;

//import com.nighthawk.csa.database.scrum.ScrumSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
/**
import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional //ask mr m abt these two
public class ClubSqlRepository {
    @Autowired
    private ClubJpaRepository jpa;

    public List<Club>listlike(String term){
        return jpa.findClubName(term, term);

    }

    public List<Club>listLike(String term) {
        String like_term = String.format("%%%s%%",term);
        return jpa.findByLikeTermNative(like_term);
    }

    public void save(Club club) {
        jpa.save(club);
    }

    public Club get(long id){
        return (jpa.findById(id).isPresent())
                ? jpa.findById(id.get())
                : null;
    }

    public void delete(long id) {
        jpa.deleteById(id);
    }
}
 **/
