package com.finalproj.finalproject.repository;

import com.finalproj.finalproject.model.Competitors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CompetitorsRepository extends JpaRepository<Competitors,Integer> {

    @Query("SELECT c FROM Competitors c WHERE c.user.userId=?1 order by c.votes")
    Optional<Competitors> getCompetitorsByUserId(int userId);

    @Query("SELECT c FROM Competitors c WHERE c.department.departmentId=?1 order by c.votes")
    List<Competitors> getCompetitorsByDepartmentId(int departmentId);

}
