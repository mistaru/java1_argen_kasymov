package com.example.service;

import com.example.model.Codes;
import com.example.model.Rate;
import com.example.repository.CodesRepository;
import com.example.repository.RateRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@Service
public class CurrencyService {
   private final RateRepository rateRepository;
   private final CodesRepository codesRepository;

    public CurrencyService(RateRepository rateRepository, CodesRepository codesRepository) {
        this.rateRepository = rateRepository;
        this.codesRepository = codesRepository;
    }

    public List<Rate> getByDate(LocalDate now){
        return rateRepository.findByDateCurrency(now);
    }

    public String toJson(List<Rate> rateList){


        String jsonStr="";

        // Creating Object of ObjectMapper define in Jakson Api
        ObjectMapper Obj = new ObjectMapper();

        try {

            // get Oraganisation object as a json string
            jsonStr = Obj.writeValueAsString(rateList);

            // Displaying JSON String
            System.out.println(jsonStr);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    public void save(Rate rate){
        rateRepository.save(rate);
    }

    public Codes findByCode(String code){
       return  codesRepository.findByCode(code);
    }



    @Transactional
    public void deleteByDate(LocalDate localDate){
        rateRepository.deleteByDateCurrency(localDate);
    }
 }
