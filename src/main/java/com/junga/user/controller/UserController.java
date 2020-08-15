package com.junga.user.controller;

import com.junga.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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
    public @ResponseBody String hello() {
        return "hello";
    }

    @RequestMapping(value = "/showAllUsers", method = RequestMethod.GET)
    public String showAllUsers(Model model) throws Exception {
        model.addAttribute("users", userService.getAllUser());
        return "/showUser";
    }

    @RequestMapping(value = "/showUser/{id}", method = RequestMethod.GET)
    public String showUser(@PathVariable final int id, Model model) throws Exception {
        model.addAttribute("users", userService.getUser(id));
        return "/showUser";
    }

    @RequestMapping(value = "/removeUser/{id}")
    public @ResponseBody String removeUser(@PathVariable final int id) throws Exception {
        if (userService.deleteUser(id)) return "success";
        else return "fail";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUser() {
        return "addUser";
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public String addUser(HttpServletRequest httpServletRequest, Model model) throws Exception {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        userService.insertUser(username, password);
        model.addAttribute("users", userService.getAllUser());
        return "/showUser";
    }
}
