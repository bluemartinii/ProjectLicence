package com.example.ProjectLicence.repository;

import com.example.ProjectLicence.model.entity.Penalty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PenaltyRepository extends JpaRepository<Penalty, Integer> {
    @Query( "select p from Penalty p where id in :ids" )
    List<Penalty> findByIds(@Param("ids") List<Long> penaltyIds);
}
