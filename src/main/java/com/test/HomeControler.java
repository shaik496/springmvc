package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeControler {
    @RequestMapping("/home")
    public String home(){
        return "index";
    }
    
}