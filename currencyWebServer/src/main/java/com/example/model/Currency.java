package com.example.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlRootElement(name="Currency")
@XmlAccessorType(XmlAccessType.FIELD)
public class Currency {

    @XmlAttribute(name="ISOCode")
    String isoCode;

    @XmlElement(name = "Nominal")
    String nominal;

    @XmlElement(name = "ValidFor",required = false)
    String validFor;

    @XmlElement(name = "Value")
    String value;
}
