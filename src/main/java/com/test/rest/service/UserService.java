package com.test.rest.service;

import com.test.UserAction.user.UserDAO;

import java.util.List;

/**
 * Created by dileepa on 12/24/15.
 */
public interface UserService {

    List<UserDAO> getPersonsList();

}
