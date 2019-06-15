package com.example.service;

import com.example.model.Currency;
import com.example.model.CurrencyRates;
import com.example.model.Rate;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CurrencyService {
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

    public List<Rate> getListRate(CurrencyRates rates){
        List<Rate> rateList = new ArrayList<>();

        for (Currency currency: rates.getCurrencyList()) {
            Rate rate = new Rate(currency);
            rateList.add(rate);
        }
        return rateList;
    }
}
