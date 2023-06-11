package com.example.project1.repository;

import com.example.project1.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ClientRepository extends JpaRepository<Client, Long> {



    }