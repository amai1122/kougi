package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewMondaiController{

    @RequestMapping("/view-mondai-input")
    public String input(Model model) {
      ViewMondaiForm form = new ViewMondaiForm();
      model.addAttribute("viewMondaiForm", form);
        return "viewMondaiInput";
    }

    @RequestMapping("/view-mondai-result")
    public String result(ViewMondaiForm form) {
        return "viewMondaiResult";
    }
}
