package com.guli.mac_base_app.Controller;

import com.guli.mac_base_app.Model.User;
import com.guli.mac_base_app.Repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/showall")
    public List<User> showUsers(){
        return userRepository.findAll();
    }

    @PutMapping("/add")
    public void addUser(@RequestBody User user){
        userRepository.save(user);
        return;
    }

}
