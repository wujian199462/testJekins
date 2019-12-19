package com.wujian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JekinsApp {

    @RequestMapping("/")
    public String index(){
        return "you are so handsoen";
    }

    public static void main(String[] args) {
        SpringApplication.run(JekinsApp.class,args);
    }
}
