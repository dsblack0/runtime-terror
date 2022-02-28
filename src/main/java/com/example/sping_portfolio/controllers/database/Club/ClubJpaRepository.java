package com.example.sping_portfolio.controllers.database.Club;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClubJpaRepository extends JpaRepository<Club, Long> {
//
//    @Query(value = "SELECT p FROM Club p WHERE p.name LIKE :Name or p.president LIKE :President", nativeQuery = true)
//    List<Club> findByLikeTermNative(String Name, String President);
    List<Club> findByName(String name);


}
