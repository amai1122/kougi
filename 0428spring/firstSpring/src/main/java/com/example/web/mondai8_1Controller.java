package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mondai8_1Controller {

    @RequestMapping("/mondai8_1")
    public String mondai8_1(Model model) {
    	Mondai8_1PrintForm form = new Mondai8_1PrintForm();
        model.addAttribute("mondai8_1PrintForm", form);

        return "mondai8_1";
    }

    @RequestMapping("/mondai8_1oprint")
    public String helloprint(Mondai8_1PrintForm form) {
        return "mondai8_1oprint";
    }
}
