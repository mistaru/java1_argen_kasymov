package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Codes;

@Repository
public interface CodesRepository extends JpaRepository<Codes,String>
{
    Codes findByCode(String code);
}
