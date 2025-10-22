package org.example.controller;

import org.example.model.Login;
import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8080")
public class Controller {
    @Autowired
    private Service service;
    @PostMapping()
    private String login_user(@RequestBody Login login){
       return service.ByEmail(login);
    }
}
