package com.khalid7487.springsecurityjwtexample.repository;

import com.khalid7487.springsecurityjwtexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String username);

}
