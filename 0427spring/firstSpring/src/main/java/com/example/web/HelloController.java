package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        HelloPrintForm form = new HelloPrintForm();
        model.addAttribute("helloPrintForm", form);
        return "hello";
    }

    @RequestMapping("/helloprint")
    public String helloprint(HelloPrintForm form) {
        return "helloprint";
    }
}
