/* package com.example.sping_portfolio.controllers.database.Reviews;

import com.example.sping_portfolio.controllers.database.Reviews.Reviews;
import com.example.sping_portfolio.controllers.database.Reviews.ReviewsJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional //ask mr m abt these two
public class ReviewsSqlRepository {
    private ReviewsJpaRepository jpa;

    public List<Reviews>listAll(){
        return jpa.findAll();

    }

    public void save(Reviews review) {
        jpa.save(review);
    }
    
    public Reviews get(long id){
        return (jpa.findById(id).isPresent()) 
            ? jpa.findById(id).get()
            : null;
    }

    public void delete(long id) {
        jpa.deleteById(id);
    }
} */
