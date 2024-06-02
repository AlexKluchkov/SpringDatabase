package com.springdatabase.DatabaseSpring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
public class User
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Getter @Setter
    String full_name;
    @Getter @Setter
    String role;
    //enum
}
