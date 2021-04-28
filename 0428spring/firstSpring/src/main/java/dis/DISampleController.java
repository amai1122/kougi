package dis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import service.DISampleService;

@Controller
public class DISampleController {

    @Autowired
    private DISampleService diService;

    @ModelAttribute("diForm")
    public DISampleForm setForm() {
        return new DISampleForm();
    }

    @RequestMapping("/di-sample-input")
    public String input() {
        return "dis/diSampleInput";
    }

    @RequestMapping(value = "/di-sample-result")
    public String result(@ModelAttribute("diForm") DISampleForm form, Model model) {
        String msg = diService.getDateMessage(form.getMonth(), form.getDay());
        model.addAttribute("dateMessage", msg);

        return "dis/diSampleResult";
    }
}