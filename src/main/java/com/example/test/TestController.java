package com.example.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/test")
    @ResponseBody
    public String getTest() {

        System.out.println(">>>test:");

        return ">>>test!";//http://localhost:7081/test
    }
}
