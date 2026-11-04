package com.guli.mac_base.Controller;

import com.guli.mac_base.Dto.UserDto;
import com.guli.mac_base.Model.User;
import com.guli.mac_base.Service.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {

        this.userServices = userServices;
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody UserDto user) {

        userServices.addUser(user);
    }

    @GetMapping("/findUser")
    public List<User> findUser(){

        return userServices.findAllUsers();
    }

    @PostMapping("/deleteUser")
    public void deleteUser(@RequestParam String name) {

        userServices.deleteUser(name);
    }

    @PostMapping("/editUser")
    public void editUser(@RequestParam (required = false) String name,
                         @RequestParam (required = false) String password,
                         @RequestBody UserDto userdto){
        userServices.editUser(name, password, userdto);
    }
    
}