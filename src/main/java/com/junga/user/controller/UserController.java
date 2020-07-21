package com.junga.user.controller;

import com.junga.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class  UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("msg", "World");
        return "/index";
    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }


    @RequestMapping(value = "/showAllUsers", method = RequestMethod.GET)
    public String showUsers(Model model) throws Exception {
        model.addAttribute("users", userService.getAllUser());
        return "/showUser";
    }
}
