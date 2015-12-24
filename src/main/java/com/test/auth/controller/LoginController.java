package com.test.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dileepa on 12/24/15.
 */

@Controller
public class LoginController {

    @RequestMapping(value = {"/login" })
    public String login() {
        return "auth/login";
    }

}
