package com.test.rest.service;

import com.test.UserAction.UserMongo.SpringMongoConfig;
import com.test.UserAction.user.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import java.util.List;

/**
 * Created by dileepa on 12/24/15.
 */
public class UserServiceImpl implements UserService {

    ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
    MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

    public List<UserDAO> getPersonsList() {
        List<UserDAO> listUser = mongoOperation.findAll(UserDAO.class);
        return listUser;
    }

}
