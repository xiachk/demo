package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object hello() {
        List<String> list = new ArrayList<>();
        list.add("zzzz");
        list.add("bbbbb");
        list.add("ccccc");
        return list;
    }
}