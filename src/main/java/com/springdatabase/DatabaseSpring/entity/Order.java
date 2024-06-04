package com.springdatabase.DatabaseSpring.entity;
import com.springdatabase.DatabaseSpring.entity.enumeration.orderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import java.time.LocalDate;


@Entity
@Getter @Setter
public class Order
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private int number;
    private LocalDate date;
    private String customer;
    private OrderStatus status;
}
