package com.qf.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping(value = "/comsumer")
public class ComsumerController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/test")
    @ResponseBody
    @HystrixCommand(defaultFallback = "def")
    public String test(){
        String result = restTemplate.getForObject("http://SERVER-PRO/user/text/12", String.class);
        return result;
    }

    public String def(){
        return "服务器调用失败，请稍后调用";
    }
}
