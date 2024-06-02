package com.springdatabase.DatabaseSpring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import java.time.LocalDate;

@Entity
public class Order
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int number;
    @Getter @Setter
    private LocalDate Date;
    @Getter @Setter
    private String Customer;
}
