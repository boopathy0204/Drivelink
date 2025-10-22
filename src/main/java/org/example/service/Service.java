package org.example.service;

import org.example.model.Login;
import org.example.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;


public class Service {
    @Autowired
    private Repository repository;
    public String ByEmail(Login login){
        boolean exists= repository.existsByEmail(login.getEmail());
        if(exists) return "Get out";
        repository.save(login);
        return "save";
    }

}
