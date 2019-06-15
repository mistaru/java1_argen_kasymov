package com.example.it.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rate {
    String code;
    String value;

    public Rate(Currency rate){
        this.code = rate.isoCode;
        this.value = rate.value;

    }
}
