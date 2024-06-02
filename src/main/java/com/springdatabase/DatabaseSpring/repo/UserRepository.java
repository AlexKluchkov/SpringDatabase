package com.springdatabase.DatabaseSpring.repo;

import com.springdatabase.DatabaseSpring.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
}
