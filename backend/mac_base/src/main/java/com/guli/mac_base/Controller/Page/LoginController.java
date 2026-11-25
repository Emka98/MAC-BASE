package com.guli.mac_base.Controller.Page;

import com.guli.mac_base.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String LoginController() {
        return "Login";
    }

    @ResponseBody()
    @PostMapping("/login")
    public String LoginController(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (userService.login(username, password)) {
            return "Jesteś zalogowany";
        }
        else {
            return "Chuj Ci w dupe";
        }
    }
}
