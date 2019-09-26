package com.qf.controller;

import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/feign")
public class FeignController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){

        return userService.text(555);
    }
}
