package com.twesche.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/1")
public class TestController1 {
    @GetMapping
    public Integer test1()
    {
        return 1;
    }

}
