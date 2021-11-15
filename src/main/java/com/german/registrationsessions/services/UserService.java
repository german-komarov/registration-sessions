package com.german.registrationsessions.services;


import com.german.registrationsessions.domain.User;
import com.german.registrationsessions.exceptions.NotFoundException;
import com.german.registrationsessions.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    private final UserRepository repository;


    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }


    public User readByEmailWithRoles(String email) throws NotFoundException {
        Optional<User> optionalUser = this.repository.findByEmailWithRoles(email);

        if(optionalUser.isPresent()) {
            // Yes, I know about inlining, but for important objects,
            // I prefer to create separate variable, for debug purposes
            User user = optionalUser.get();
            return user;
        }

        throw new NotFoundException(String.format("There is no user with email = %s", email));
    }
}

