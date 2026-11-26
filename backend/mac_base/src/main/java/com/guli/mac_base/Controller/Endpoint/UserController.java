package com.guli.mac_base.Controller.Endpoint;

import com.guli.mac_base.Model.User;
import com.guli.mac_base.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/show")
    public String showUsers(@RequestParam("limit") Integer limit) {

        return " ";
    }

    @PostMapping
    public String addUser(@ModelAttribute User user) {
        return "redirect:/user/list";
    }


}
