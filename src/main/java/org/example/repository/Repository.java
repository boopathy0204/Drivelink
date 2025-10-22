package org.example.repository;

import org.example.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Login,Long> {
    public  boolean existsByEmail(String email);
}
