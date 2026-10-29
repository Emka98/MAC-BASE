package com.guli.mac_base.Controller;

import com.guli.mac_base.Model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/addUser")
    public String addUser(@RequestParam String name,
                          @RequestParam String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        return "Dodano Uzytkownika";
    }

}
