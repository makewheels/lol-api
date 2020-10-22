package com.eg.lolapi.local;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/championEnglishAndChinese")
    public String championEnglishAndChinese(Model model) {
        model.addAttribute("hello", "fewwefewgfweg");
        return "championEnglishAndChinese";
    }

}
