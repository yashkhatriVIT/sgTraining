package com.example.springCourse.dao;

import com.example.springCourse.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StkDoa extends JpaRepository<Stock, Long> {
    @Query(nativeQuery = true, value="select * from stock s where s.comp_id = :id and (STR_TO_DATE(s.date, '%d-%m-%Y') between STR_TO_DATE(:startDate, '%d-%m-%Y') and STR_TO_DATE(:endDate, '%d-%m-%Y'))")
    List<Stock> getData_between(@Param("id") long id, @Param("startDate") String startDate, @Param("endDate") String endDate);

}
