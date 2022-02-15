//package com.example.sping_portfolio.controllers.database;
//
//import org.springframework.data.jpa.repository.JpaRepository; //check these
//import org.springframework.data.jpa.repository.Query;
//
//import javax.persistence.QueryHint;
//import java.util.List;
//
//public interface ClubJpaRepository extends JpaRepository<Club, Long> {
//    List<Club> findClubName(String name, String president);
//
//    @Query( //check this
//            value = "SELECT * FROM Club p WHERE p.name LIKE ?1 or p.president LIKE ?1",
//            nativeQuery = true)
//
//    List<Club> findByLikeTermNative(String term);
//
//}
