package com.example.soapside;


import com.example.soapside.repository.UserRepository;
import com.example.soapside.service.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        User Bob = new User();
        return args -> {

            Bob.setName("Bob");
            Bob.setEmpId(1112);
            Bob.setSalary(112.5);
            repository.save(Bob);
        };





    }
}