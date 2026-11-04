package com.guli.mac_base.Controller;

import com.guli.mac_base.Dto.UserDto;
import com.guli.mac_base.Model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/MacAdress")
public class MacAdressController {

    MacServices

    @PostMapping("/addUser")
    public void addUser(@RequestBody UserDto user) {

        userServices.addUser(user);
    }

    @GetMapping("/findUser")
    public List<User> findUser(){

        return userServices.findAllUsers();
    }


}
