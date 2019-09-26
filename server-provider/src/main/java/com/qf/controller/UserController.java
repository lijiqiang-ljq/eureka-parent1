package com.qf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping(value = "/text/{id}")
    @ResponseBody
    public String text(@PathVariable Integer id){

        return port+"："+id;
    }
}
