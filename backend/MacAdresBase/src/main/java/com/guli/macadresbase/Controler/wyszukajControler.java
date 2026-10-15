package com.guli.macadresbase.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class wyszukajControler {
    @GetMapping("/wyszukaj")
    String getWyszukajControler(){
        return "wyszukaj";
    }
}