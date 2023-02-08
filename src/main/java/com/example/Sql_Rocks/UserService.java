package com.example.Sql_Rocks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    //userrepository is an interface, we are creating the bean for the class which is implementing this interface
    //simplejparepository

    public String addUser(User user)
    {
        userRepository.save(user);
        return "user added successfully";
    }

    public User getUser(int id)
    {
        //help you find the entity by primary key
        return userRepository.findById(id).get();
    }

    public List<User> findAll()
    {
        return userRepository.findAll();
    }
}
