package com.guli.mac_base.Controller.Action;

import com.guli.mac_base.Dto.UserDto;
import com.guli.mac_base.Model.User;
import com.guli.mac_base.Service.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {

        this.userServices = userServices;
    }

    @PostMapping("/add")
    public void AddUser(@RequestBody UserDto userDto) {

        userServices.AddUser(userDto);
    }

    @PostMapping("/findAll")
    public List<UserDto> FindAllUser() {
        return userServices.FindAllUser();
    }

    @PostMapping("/delete")
    public void DeleteUser(@RequestParam String name) {

    }
}
