package com.test.Instagram_App.service;

import com.test.Instagram_App.model.AuthenticationToken;
import com.test.Instagram_App.repository.IAuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    IAuthenticationRepo authenticationRepo;

    public boolean authenticate(String email,String authTokenValue){
        AuthenticationToken authToken = authenticationRepo.findFirstByTokenValue(authTokenValue);

        if(authToken == null){
            return false;
        }

        String tokenConnectedEmail = authToken.getUser().getEmail();
        return tokenConnectedEmail.equals(email);
    }
}
