package com.yimei.service;

import com.yimei.UserService;
import com.yimei.ext.hessian.KittHessianProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

/**
 * Created by hongpf on 16/5/5.
 */
@Configuration
public class HelloService {

    @Bean
    public HessianProxyFactoryBean helloClient1() {
        HessianProxyFactoryBean factory = new KittHessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8080/UserService");
        factory.setServiceInterface(UserService.class);
        return factory;
    }
}
