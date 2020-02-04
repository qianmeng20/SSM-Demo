package com.huang.ssmdemo.controller;

import com.huang.ssmdemo.pojo.User;
import com.huang.ssmdemo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "showAll")
    public ModelAndView showAll(){
        ArrayList<User> list = userService.showAll();
        ModelAndView mv = new ModelAndView("show");
        mv.addObject("data", list);
        return mv;
    }
    @RequestMapping(value = "delete")
    public ModelAndView delete(@RequestParam int id){
        userService.delete(id);
        return showAll();
    }
    @RequestMapping(value = "add")
    public ModelAndView add(@RequestParam String name, @RequestParam String password, @RequestParam String type ){
        userService.add(name, password, type);
        return showAll();
    }

}