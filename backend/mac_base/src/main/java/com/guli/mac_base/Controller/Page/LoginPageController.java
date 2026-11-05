package com.guli.mac_base.Controller.Page;

import com.guli.mac_base.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginPageController {

    @Autowired
    private LoginService loginService;

    public LoginPageController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping()
    public String loginPage(){

        return "Login";
    }

    @PostMapping("/loginIn")
    public String loginIn(@RequestParam String username,@RequestParam String password){
    loginService.loginIn(username,password);
        return "Login";
    }
}
