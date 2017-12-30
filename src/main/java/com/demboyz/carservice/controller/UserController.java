package com.demboyz.carservice.controller;

import com.demboyz.carservice.repository.UserRepository;
import com.demboyz.carservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void createUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public User getUser(@PathVariable long id) {
        return userRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        // TODO <--
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable("id") Long id) {
        userRepository.delete(id);
    }

}
