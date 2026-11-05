package com.guli.mac_base.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/wyszukaj")
public class wyszukajPageController {


    @GetMapping()
    public String wyszukaj(){
        return "wyszukaj";
    }

    @PostMapping("/findDevice")
    public String findDevice(@RequestParam (required = false) String typeDevice,
                             @RequestParam (required = false) Long serialNumber,
                             @RequestParam (required = false) Long macAddress,
                             @RequestParam (required = false) String Note,
                             @RequestParam (required = false) LocalDateTime dateCreated,
                             @RequestParam (required = false) Integer amountOfAddress){

        return "wyszukaj";
    }

}
