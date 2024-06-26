package com.springdatabase.DatabaseSpring.entity;
import com.springdatabase.DatabaseSpring.entity.enumeration.orderStatus;
import jakarta.persistence.*;
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
    private OrderStatus status;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<Product> productId;
    @OneToOne
    private User userId;
}
