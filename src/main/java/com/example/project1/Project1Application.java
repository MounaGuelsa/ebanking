package com.example.project1;


import com.example.project1.model.Client;
import com.example.project1.repository.ClientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;




@SpringBootApplication
//permet de demarer l'app spring boot
public class Project1Application  implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Project1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Client client0 = new Client();
        client0.setNom("mouna");
        client0.setPrenom("guelsa");
        client0.setMail("mouna@gmail.com");
        clientRepository.save(client0);

    }
}
