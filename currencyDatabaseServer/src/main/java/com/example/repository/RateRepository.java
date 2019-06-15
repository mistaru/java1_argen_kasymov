package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Rate;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RateRepository extends JpaRepository<Rate,Long> {
    void deleteByDateCurrency(LocalDate localDate);
    List<Rate> findByDateCurrency(LocalDate localDate);
}
