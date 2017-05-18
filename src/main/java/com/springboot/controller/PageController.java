package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping(value = {"/","/index"})
    public String index(Model model) {
        model.addAttribute("content", "hi Spring Boot JSP");
        return "index";
    }

    @RequestMapping(value = {"/page1"})
    public String page1(Model model) {
        model.addAttribute("content", "Spring Boot page1 JSP");
        return "page1";
    }
}
