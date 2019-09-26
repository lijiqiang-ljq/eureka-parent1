package com.qf.service;

import com.qf.service.impl.UserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "SERVER-PRO",fallback = UserServiceFallBack.class)
//@RequestMapping(value = "/user") 开启了Hystrix这里不能用RequestMapping，写到下面去
public interface IUserService {

    @RequestMapping(value = "/user/text/{id}")
    public String text(@PathVariable("id") Integer id);
}
