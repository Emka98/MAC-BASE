package com.devtiro.mac_base.Controller;

import com.devtiro.mac_base.Model.User;
import com.devtiro.mac_base.Repository.UserRepository;
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

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userRepository.save(user);
        return "added" + user.toString();
    }

    @GetMapping("/showAllUsers")
    public List<User> showAllUsers(){
        return userRepository.findAll();
    }
}
