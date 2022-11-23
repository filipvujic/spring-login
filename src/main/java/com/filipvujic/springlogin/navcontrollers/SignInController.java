package com.filipvujic.springlogin.navcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {

    @GetMapping("sign-in")
    public String getSignIn() {
        return "sign-in";
    }
}
