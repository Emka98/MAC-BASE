package com.guli.mac_base.Controller.Action;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/TypeDevice")
public class TypeDeviceController {

    @PostMapping("/addDevice")
    public void addDevice(@RequestParam String name,
                          @RequestParam String type,
                          @RequestParam String value,
                          @RequestParam String description) {

    }

    @PostMapping("/deleteUser")
    public void deleteUser(@RequestParam String name) {

    }
}
