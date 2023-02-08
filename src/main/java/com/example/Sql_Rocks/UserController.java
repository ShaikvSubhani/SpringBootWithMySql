package com.example.Sql_Rocks;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String adduser( @RequestBody User user)
    {
    return userService.addUser(user);
    }

    @GetMapping("/get")
    public User getuser(@RequestParam("id") int id)
    {
        return userService.getUser(id);
    }

    @GetMapping("/findall")
    public List<User> findAll()
    {
        return userService.findAll();
    }
}
