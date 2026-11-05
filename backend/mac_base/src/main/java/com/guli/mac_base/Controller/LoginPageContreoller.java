package com.guli.mac_base.Controller;

import com.guli.mac_base.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginPageContreoller {

    @Autowired
    private LoginService loginService;

    public LoginPageContreoller(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping()
    public String loginPage(){

        return "login";
    }

    @PostMapping("/loginIn")
    public String loginIn(@RequestParam String username,@RequestParam String password){
    loginService.loginIn(username,password);
        return "login";
    }
}
