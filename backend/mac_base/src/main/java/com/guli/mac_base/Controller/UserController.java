package com.guli.mac_base.Controller;

import com.guli.mac_base.Model.User;
import com.guli.mac_base.Service.UserServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {

        this.userServices = userServices;
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        userServices.addUser(user);
    }

    @PostMapping("/deleteUser")
    public void deleteUser(Integer userId){
    }

    @PostMapping("/findUser")
    public void findUser(){
    }

}