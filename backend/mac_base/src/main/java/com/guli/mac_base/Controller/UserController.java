package com.guli.mac_base.Controller;

import com.guli.mac_base.Dto.UserDto;
import com.guli.mac_base.Model.User;
import com.guli.mac_base.Service.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {

        this.userServices = userServices;
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody UserDto userDto) {

        userServices.addUser(userDto);
    }

    @GetMapping("/findUser")
    public List<User> findUser(){

        return userServices.findAllUsers();
    }

    @PostMapping("/deleteUser")
    public void deleteUser(@RequestBody User user) {

        userServices.deleteUser(user);
    }
//
//    @PostMapping("/editUser")
//    public void editUser(@RequestParam (required = false) String name, @RequestParam (required = false) String password, @RequestBody UserDto userdto){
//        userServices.editUser(name, password, userdto);
//    }
//
//    @GetMapping("/findUser")
//    public List<User> findUser(){
//
//        return userServices.findAllUser();
//    }

}