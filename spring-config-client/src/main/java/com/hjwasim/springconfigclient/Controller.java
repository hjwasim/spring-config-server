package com.hjwasim.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${msg:Config Server is not working. Please check...}")
    private String msg;

    @GetMapping("/")
    public String getProps(){
        return this.msg;
    }
}
