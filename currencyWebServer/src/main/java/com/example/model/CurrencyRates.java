package com.example.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name="CurrencyRates")
@XmlAccessorType(XmlAccessType.FIELD)
public class CurrencyRates {

    @XmlAttribute(name="Date")
    String date;

    @XmlAttribute(name="Name")
    String name;

    @Getter
    @XmlElement(name ="Currency")
    List<Currency> currencyList;
}
