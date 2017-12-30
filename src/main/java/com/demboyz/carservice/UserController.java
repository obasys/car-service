package com.demboyz.carservice;

import com.demboyz.carservice.model.User;
import com.demboyz.carservice.model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@EnableAutoConfiguration
@RequestMapping("/users")
public class UserController {


    // Test bullshit
    private final AtomicLong id = new AtomicLong();
    private static final String firstName = "testFirstName";
    private static final String lastName = "testLastName";
    private static final long profilePictureId = -1;
    private static final long infoId = -1;
    private static final int flag = -1;
    private static final long lastEditTime = 1;
    private static final long creationTime = 1;


    @RequestMapping("/test")
    @ResponseBody
    public User user() {
        return new User(id.incrementAndGet(), firstName, lastName, profilePictureId, infoId, flag, lastEditTime, creationTime);
    }
    // End of test bullshit


    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void createUser(@RequestBody User user) {
        userRepository.save(user);
        //return Long.valueOf(-1);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public User getUser(@PathVariable long id) {
        //User user = new User(1, "test", "test", 1, 1, 1, 1, 1);
        //Info info = new Info(1, "test@gmail.com");

        //user.setInfo(info);

        //return user;

        return userRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public User[] getUsers() {
        User user = new User(1, "test", "test", 1, 1, 1, 1, 1);
        User user2 = new User(2, "test", "test", 2, 2, 1, 1, 1);
        User user3 = new User(3, "test", "test", 3, 3, 1, 1, 1);
        User user4 = new User(4, "test", "test", 4, 4, 1, 1, 1);

        Info info = new Info(1, "test@gmail.com");
        Info info2 = new Info(2, "test2@gmail.com");
        Info info3 = new Info(3, "test3@gmail.com");
        Info info4 = new Info(4, "test4@gmail.com");

        /*user.setInfo(info);
        user2.setInfo(info2);
        user3.setInfo(info3);
        user4.setInfo(info4);*/

        User[] users = new User[] {user, user2, user3, user4};


        return users;
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
