package com.springdatabase.DatabaseSpring.entity;
import com.springdatabase.DatabaseSpring.entity.enumeration.userRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class User
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    String fullName;
    private userRole role;
}
