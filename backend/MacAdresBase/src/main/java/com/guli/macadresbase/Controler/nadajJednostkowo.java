package com.guli.macadresbase.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class nadajJednostkowo {
    @GetMapping("/nadanie_jednostkowe")
    String getnadaj_seryjnie(){
        return "nadanieJednostkowe";
    }
}
