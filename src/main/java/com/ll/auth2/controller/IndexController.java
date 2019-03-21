package com.ll.auth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Roman.wang
 * @Date 2019/3/18 15:36
 **/
@RestController
public class IndexController {

    @GetMapping("/sayHello")
    private String sayHello(){
        System.out.println("Hello World");
        return "Hello World";
    }

}
