package com.guli.mac_base.Controller.Action;

import com.guli.mac_base.Dto.UserDto;
import com.guli.mac_base.Model.User;
import com.guli.mac_base.Service.UserServices;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Users")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {

        this.userServices = userServices;
    }

    @PostMapping("/AddUser")
    public void addUser(@RequestBody UserDto user) {

        userServices.addUser(user);
    }

    @GetMapping("/FindUser")
    public List<User> findUser(){

        return userServices.findAllUsers();
    }

    @PostMapping("/DeleteUser")
    public void deleteUser(@RequestParam String name) {

        userServices.deleteUser(name);
    }

    @PostMapping("/EditUser")
    public void editUser(@RequestParam (required = false) String name,
                         @RequestParam (required = false) String password,
                         @RequestBody UserDto userdto){
        userServices.editUser(name, password, userdto);
    }
    
}