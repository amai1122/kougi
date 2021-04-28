package valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ValidSampleController {

    @ModelAttribute("vsForm")
    public ValidSampleForm setForm() {
        return new ValidSampleForm();
    }

    @RequestMapping("/valid-sample-input")
    public String input() {
        return "valid/validSampleInput";
    }

    @RequestMapping(value = "/valid-sample-conf")
    public String conf(@Validated @ModelAttribute("vsForm") ValidSampleForm form
            , BindingResult result) {
        if(result.hasErrors()) {
            return "valid/validSampleInput";
        }
        return "valid/validSampleConf";
    }
}