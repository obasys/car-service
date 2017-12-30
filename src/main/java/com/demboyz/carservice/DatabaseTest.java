package com.demboyz.carservice;

import com.demboyz.carservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@RequestMapping("/database")
public class DatabaseTest {

    @Autowired
    private UserRepository userRepository;


    @GetMapping(path="/add")
    @ResponseBody
    public String addUser() {
        User user = new User();
        user.setFirstName("testFirstName");
        user.setLastName("testLastName");
        user.setProfilePictureId(-1);
        user.setInfoId(-1);
        user.setFlag(-1);
        user.setLastEditTime(1514563570);
        user.setCreationTime(1514563570);
        userRepository.save(user);

        return "Saved";
    }


    @GetMapping(path="/all")
    @ResponseBody
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }


}
