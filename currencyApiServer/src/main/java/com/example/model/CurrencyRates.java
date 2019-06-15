package com.example.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Getter
@Setter

public class CurrencyRates {

    String date;

    String name;

    List<Currency> currencyList;
}
