package com.guli.mac_base.Controller.Page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/wyszukaj")
public class SearchPageController {


    @GetMapping()
    public String wyszukaj(){
        return "SearchMac";
    }

    @PostMapping("/findDevice")
    public String findDevice(@RequestParam (required = false) String typeDevice,
                             @RequestParam (required = false) Long serialNumber,
                             @RequestParam (required = false) Long macAddress,
                             @RequestParam (required = false) String Note,
                             @RequestParam (required = false) LocalDateTime dateCreated,
                             @RequestParam (required = false) Integer amountOfAddress){

        return "SearchMac";
    }

}
