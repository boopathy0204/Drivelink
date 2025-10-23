package org.example.service;

import org.example.model.Login;
import org.example.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;
    public String ByEmail(Login login){
         Login exists= repository.findByEmail(login.getEmail());
        if(exists == null) return "user doesn't exists";
        if (exists.getPassword().equals(login.getPassword())) {
            return "Login successfully";
        }
        return "Wrong Password";
    }

}
