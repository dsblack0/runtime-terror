/* package com.example.sping_portfolio.controllers.database.Reviews;

import com.example.sping_portfolio.controllers.database.Reviews.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewsJpaRepository extends JpaRepository<Reviews, Long> {
    List<Reviews> findReviewName(String name, String review);

    @Query( //check this
            value = "SELECT * FROM Reviews p WHERE p.name LIKE ?1 or p.review LIKE ?1",
            nativeQuery = true)

    List<Reviews> findByLikeTermNative(String term);

} */