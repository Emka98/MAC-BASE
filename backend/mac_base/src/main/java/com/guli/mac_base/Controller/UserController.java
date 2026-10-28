package com.guli.mac_base.Controller;

import com.guli.mac_base.Model.User;
import com.guli.mac_base.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/addUser")
    public String addUser(@RequestParam String name,
                          @RequestParam String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        userRepository.save(user);
        return "Dodano";
    }

}
