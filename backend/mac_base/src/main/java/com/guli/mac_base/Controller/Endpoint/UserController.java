package com.guli.mac_base.Controller.Endpoint;

import com.guli.mac_base.Model.User;
import com.guli.mac_base.Repository.UserRepository;
import com.guli.mac_base.Service.UserService;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    private UserRepository userRepository;

    public void setUserService(UserService userService, UserRepository userRespository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @ResponseBody
    @GetMapping("/show")
    public String showUsers(@RequestParam(name = "limit", defaultValue = "10") Integer limit) {
    return this.userRepository.findAll().toString();
    }

    @PostMapping
    public String addUser(@ModelAttribute User user) {
        return "redirect:/user/list";
    }


}
