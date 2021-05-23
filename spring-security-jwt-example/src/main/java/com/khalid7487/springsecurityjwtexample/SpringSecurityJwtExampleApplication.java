package com.khalid7487.springsecurityjwtexample;

import com.khalid7487.springsecurityjwtexample.entity.User;
import com.khalid7487.springsecurityjwtexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {

    @Autowired
    private UserRepository repository;

    //	@PostConstruct
//	public void initUsers() {
//		List<User> users = Stream.of(
//				new User(101, "javatechie", "password", "javatechie@gmail.com"),
//				new User(102, "user1", "pwd1", "user1@gmail.com"),
//				new User(103, "user2", "pwd2", "user2@gmail.com"),
//				new User(104, "user3", "pwd3", "user3@gmail.com")
//		).collect(Collectors.toList());
//		repository.saveAll(users);
//	}
    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(101, "user1", "password", "test7487@gmail.com"),
                new User(102, "user2", "password", "users7487@gmail.com"),
                new User(103, "user3", "password", "user37487@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}
