package com.qf.service.impl;

import com.qf.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallBack implements IUserService{

    @Override
    public String text(Integer id) {
        return id+"：服务调用失败";
    }
}
