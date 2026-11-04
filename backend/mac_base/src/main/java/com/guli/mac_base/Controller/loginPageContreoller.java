package com.guli.mac_base.Controller;

import com.guli.mac_base.Service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class loginPageContreoller {

    @Autowired
    private loginService loginService;

    public loginPageContreoller(loginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping()
    public String loginPage(){
        return "login";
    }

    @PostMapping("/loginIn")
    public void loginIn(@RequestParam String username,@RequestParam String password){
    loginService.loginIn(username,password);
    }
}
