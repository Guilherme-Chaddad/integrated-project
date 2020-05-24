package com.integratedproject.controller;

import com.integratedproject.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/user")
public class UserController {

    private final static Logger LOGGER = Logger.getLogger(UserController.class.getName());

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {

        LOGGER.info("Get user request by id received. Id: "+id);

        return new User();
    }

    @GetMapping()
    public List<User> getAll() {

        LOGGER.info("Get all users request");

        return new ArrayList<>();
    }

}
