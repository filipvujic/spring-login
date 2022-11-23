package com.filipvujic.springlogin.navcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {

    @GetMapping("sign-up")
    public String getSignUp() {
        return "sign-up";
    }
}
