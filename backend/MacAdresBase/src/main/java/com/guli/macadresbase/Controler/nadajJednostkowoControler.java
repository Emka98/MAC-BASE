package com.guli.macadresbase.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class nadajJednostkowoControler {
    @GetMapping("/nadanieJednostkowe")
    String getNadajJednostkowo(){
        return "nadanieJednostkowe";
    }
}
