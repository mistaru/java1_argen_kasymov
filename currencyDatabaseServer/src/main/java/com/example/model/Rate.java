package com.example.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "rate",schema = "public")
@Setter
@Getter
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "code_fk")
    private Codes code;

    @Column(name = "date_currency")
    private LocalDate dateCurrency;

    @Column(name = "value")
    private String value;

}
