package com.yimei;

import org.springframework.stereotype.Service;

import java.time.LocalDate;


/**
 * Created by hongpf on 16/4/27.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "UserServiceImpl.hello";
    }

    @Override
    public LocalDate getTime() {
        return LocalDate.now();
    }

    @Override
    public java.time.LocalDateTime getJava8LocalDate() {
        return java.time.LocalDateTime.now();
    }
}