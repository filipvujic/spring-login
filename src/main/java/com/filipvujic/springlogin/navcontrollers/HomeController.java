package com.filipvujic.springlogin.navcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("home")
    public String getHome(Model model) {
        model.addAttribute("tmptext", "Some text");
        return "home";
    }
}
