package com.springdatabase.DatabaseSpring.repository;

import com.springdatabase.DatabaseSpring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
