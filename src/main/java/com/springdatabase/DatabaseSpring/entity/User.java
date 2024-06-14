package com.springdatabase.DatabaseSpring.entity;
import com.springdatabase.DatabaseSpring.entity.enumeration.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class User
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "fullName", columnDefinition = "VARCHAR(255)")
    String fullName;
    @Column(name = "role", columnDefinition = "ENUM")
    private UserRole role;
}
