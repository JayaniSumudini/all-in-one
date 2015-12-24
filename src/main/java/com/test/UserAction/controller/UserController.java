package com.test.UserAction.controller;

import com.mongodb.MongoException;
import com.test.UserAction.UserMongo.SpringMongoConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import com.test.UserAction.user.*;

/**
 * Created by dileepa on 12/24/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = {"/users" }, method = RequestMethod.GET)
    public ModelAndView welcomePage() {

        ModelAndView model = new ModelAndView();
        model.setViewName("user/hello");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

        try {
            List<UserDAO> listUser = mongoOperation.findAll(UserDAO.class);
            model.addObject("users", listUser);
        }catch (MongoException e) {
            e.printStackTrace();
        }
        return model;

    }

    @RequestMapping(value = {"/addUser" }, method = RequestMethod.POST)
    public ModelAndView submitForm(@RequestParam("fname") String fname) {

        UserDAO user = new UserDAO(fname);

        ModelAndView model = new ModelAndView();
        model.setViewName("user/hello");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

        try {
            mongoOperation.insert(user);
            List<UserDAO> listUser = mongoOperation.findAll(UserDAO.class);
            model.addObject("users", listUser);
        }catch (MongoException e) {
            e.printStackTrace();
        }
        return model;

    }

}