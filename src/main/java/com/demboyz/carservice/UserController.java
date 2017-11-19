package com.demboyz.carservice;

import com.demboyz.carservice.model.User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {


    private final AtomicLong id = new AtomicLong();
    private static final String firstName = "testFirstName";
    private static final String lastName = "testLastName";
    private static final long profilePictureId = -1;
    private static final long infoId = -1;
    private static final int flag = -1;
    private static final long lastEditTime = 1;
    private static final long creationTime = 1;




    @RequestMapping("/test")
    public User user() {
        return new User(id.incrementAndGet(), firstName, lastName, profilePictureId, infoId, flag, lastEditTime, creationTime);
    }




}
