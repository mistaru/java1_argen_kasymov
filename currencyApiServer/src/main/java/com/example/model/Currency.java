package com.example.it.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter

public class Currency {


    String isoCode;


    String nominal;

    String validFor;

    String value;
}
