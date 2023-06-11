package com.example.project1.controller;

import com.example.project1.model.Client;
import com.example.project1.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class ClientController {


    @Autowired // inject the productRepository instance
    private ClientRepository clientRepository;
    //productRepository access to db

    @GetMapping(value = "/clients")
    public List<Client> getProducts() {
        return clientRepository.findAll();
    }



}
