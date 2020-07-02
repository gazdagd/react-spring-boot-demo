package com.gazdag.reactdemo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Stock {

    @Id
    @GeneratedValue
    private Long id;

    private String symbol;
    private String name;
    private Double currentRate;

}
