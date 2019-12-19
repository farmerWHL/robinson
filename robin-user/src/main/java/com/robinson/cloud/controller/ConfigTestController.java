package com.robinson.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigTestController {

    @Value("${girl.name:lily}")
    private String username;
    @Value("${girl.age}")
    private Integer age;

    @RequestMapping("/username")
    public String get() {
        return "girl's name:"+username+";girl's age:"+age;
    }
}
