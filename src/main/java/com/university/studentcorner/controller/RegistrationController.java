package com.university.studentcorner.controller;

import com.university.studentcorner.model.User;
import com.university.studentcorner.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationservice;

    @PostMapping("/login")
    public User loginUser(@RequestBody User user) throws Exception {
        String tempEmail = user.getEmail();
        String tempPass = user.getEnrollment();
        User userObj = null;
        if(tempEmail != null && tempPass != null) {
            userObj = registrationservice.fetchUserByUserNameAndPassword(tempEmail,tempPass);
        }
        if(userObj == null) {
            throw new Exception("bad credentials");
        }
        return userObj;
    }
}
