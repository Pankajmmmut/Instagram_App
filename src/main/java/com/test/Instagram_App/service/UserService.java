package com.test.Instagram_App.service;

import com.test.Instagram_App.model.User;
import com.test.Instagram_App.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String SignUp(User user) {

        String newEmail=user.getEmail();
        if(newEmail==null){
            return "insert valid data!";
        }
        User existingUser = userRepo.findFirstByEmail(newEmail);
        if(existingUser != null){
            return "email already registered!";
        }
        userRepo.save(user);
        return "signed up!";
    }


    public Iterable getAllUsers() {
        return userRepo.findAll();
    }
}
