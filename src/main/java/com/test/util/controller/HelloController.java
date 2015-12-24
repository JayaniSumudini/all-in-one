package com.test.util.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dileepa on 12/23/15.
 */

@Controller
public class HelloController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("hi")
    @ResponseBody
    public String hi() {
        return "Hello, world.";
    }


}
