package com.yimei;

import kitt.KittHessianServiceExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    @Autowired
    private HelloService helloService;



    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean(name = "/HelloService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new KittHessianServiceExporter();

        exporter.setService(helloService);
        exporter.setServiceInterface(HelloService.class);
        return exporter;
    }



    @Bean(name = "/UserService")
    public HessianServiceExporter userService() {
        HessianServiceExporter exporter = new KittHessianServiceExporter();
        exporter.setService(userService);
        exporter.setServiceInterface(UserService.class);
        return exporter;
    }


}
