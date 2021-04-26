package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewSampleController {

    @RequestMapping("/view-sample-input")
    public String input(Model model) {
        ViewSampleForm form = new ViewSampleForm();
        model.addAttribute("viewSampleForm", form);
        return "viewSampleInput";
    }

    @RequestMapping("/view-sample-result")
    public String result(ViewSampleForm form) {
        return "viewSampleResult";
    }
}