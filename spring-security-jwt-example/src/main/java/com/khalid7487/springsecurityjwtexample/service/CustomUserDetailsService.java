package com.khalid7487.springsecurityjwtexample.service;

import com.khalid7487.springsecurityjwtexample.entity.User;
import com.khalid7487.springsecurityjwtexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username " + username);
        User user = repository.findByUserName(username);
        System.out.println(user);
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), new ArrayList<>());
//        return new org.springframework.security.core.userdetails.User("khalid7487", "password", new ArrayList<>());
    }
}
