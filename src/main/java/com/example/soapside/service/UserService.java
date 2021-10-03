package com.example.soapside.service;

import com.example.soapside.repository.UserRepository;
import com.example.soapside.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService {
    private static final Map<String, User> users = new HashMap<>();
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void initial(){
        User Amy = new User();
        Amy.setName("Amy");
        Amy.setEmpId(1111);
        Amy.setSalary(112.5);
        users.put(Amy.getName(),Amy);
        userRepository.save(Amy);

    }

    public User getUser (int id){
        Optional<User> u = userRepository.findById(id);
        User uu = new User();
        uu.setEmpId(122);
        uu.setName("fgd");
        uu.setSalary(9348);
        if(u.isPresent())
            return u.get();
        return uu;

    }
}
