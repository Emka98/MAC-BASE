package com.guli.mac_base_app.Controller;

import com.guli.mac_base_app.Model.User;
import com.guli.mac_base_app.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/showall")
    public List<User> showUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        userRepository.save(user);
        return "chuj";
    }
}
