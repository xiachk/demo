package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {
    @GetMapping("/thy")
    public ModelAndView test() {
        ModelAndView mv = new ModelAndView();
        //向request域中设置数据
        mv.addObject("hello","haha");
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("zhangsan2");
        list.add("zhangsan3");
        list.add("zhangsan4");
        mv.addObject("list",list);
        mv.setViewName("index.html");
        return mv;
    }
}