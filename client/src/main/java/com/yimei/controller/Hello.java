package com.yimei.controller;

import com.yimei.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hongpf on 16/5/5.
 */
@Controller
public class Hello {

    @Autowired
    UserService userService ;

    @RequestMapping("/index")
    @ResponseBody
    public  Object hello(){
        return  userService.sayHello() ;
    }

}
