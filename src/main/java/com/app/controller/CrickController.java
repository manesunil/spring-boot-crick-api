package com.app.controller;

import com.app.model.User;
import com.app.service.CrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crick-api")
public class CrickController {

    @Autowired
    CrickService crickServiceImpl;

    @GetMapping("/home")
    public String home()
    {
        return "home";
    }

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    @GetMapping("/register")
    public String register()
    {
        return "register";
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user)
    {
        crickServiceImpl.register(user);

        return "";
    }

    @GetMapping("/scoreboard")
    public String scoreboard(){
        return "scoreboard";
    }

    @GetMapping("/success")
    public String success(){
        return "success";
    }



}
