package com.example.usercreation.controller;

import com.example.usercreation.model.User;
import com.example.usercreation.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String welcome(Model model){
        return "welcome";
    }
    @GetMapping("/createUser")
    public String createUsererForm(Model model){
        model.addAttribute("user", new User());
        return "createUser";
    }
    @PostMapping("/createUser")
    public String createUser(@ModelAttribute User user, Model model) {
        userService.saveUser(user);
        model.addAttribute("message", "User created successfully!");
        return "result";// Redirect to result.jsp after successful user creation
    }


}
