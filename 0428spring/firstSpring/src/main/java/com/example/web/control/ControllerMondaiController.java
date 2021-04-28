package com.example.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerMondaiController {

    @RequestMapping({"/control-mondai-input", "/control/mondai-input"})
    public String input() {
        return "control/controllerMondaiInput";
    }

    @RequestMapping(value = "/controller-mondai-result")
    public String resultPost(@RequestParam("next_btn") String bin,Model model) {
    	model.addAttribute("btn", bin);
    	return "control/controllerMondaiResult";
    }
}