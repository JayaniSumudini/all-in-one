package com.test.rest.controller;

import com.test.UserAction.user.UserDAO;
import com.test.rest.service.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dileepa on 12/24/15.
 */

@RestController
public class RestUserController {

    @RequestMapping(value = {"/restusers"}, method = RequestMethod.GET)
    public List<UserDAO> getRestusers() {

        List<UserDAO> persons = new UserServiceImpl().getPersonsList();
        return persons;

    }

    
}
