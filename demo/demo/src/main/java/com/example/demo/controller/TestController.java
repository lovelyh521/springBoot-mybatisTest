package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

/**
 * Created by lyh on 2017/7/17.
 */
@Controller
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping("add/{name}")
    @ResponseBody
    public String test1(@PathVariable("name") String name,User user){
        user.setId(UUID.randomUUID().toString());
        userService.insert(user);
        return "ok";
    }
    @RequestMapping("findall")
    @ResponseBody
    public List<User> findAll(){
        return userService.findAll();
    }
}
