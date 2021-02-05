package com.zq.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
public class Controller {
    @Value("${server.port}")
    private String port;

    @GetMapping("/sayHi")
    public String sayHi(){
        return "This is" + port;
    }

    @PostMapping("/sayHi")
    public Friend sayHipost(@RequestBody Friend friend){
        log.info("you are" + friend.getName());
        friend.setPort(port);
        return friend;
    }

}
