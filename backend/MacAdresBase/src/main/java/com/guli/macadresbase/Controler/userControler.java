package com.guli.macadresbase.Controler;

import com.guli.macadresbase.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class userControler {
    @GetMapping("/user")
    public List<User> listUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "admin", "admin"));
        users.add(new User(2, "admin", "admin"));
        users.add(new User(3, "admin", "admin"));
        return users;
    }
}
