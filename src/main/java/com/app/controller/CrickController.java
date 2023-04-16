package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crick-api")
public class CrickController {

    @GetMapping("/home")
    public String home()
    {
        return "home";
    }


}
