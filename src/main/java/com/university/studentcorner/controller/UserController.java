package com.university.studentcorner.controller;

import com.university.studentcorner.exception.UserNotFoundException;
import com.university.studentcorner.model.User;
import com.university.studentcorner.service.UserService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @param user insert
     */
    @PostMapping("/insert")
    private void insertUser(@RequestBody User user) {
        user.setPassword(Base64.encodeBase64String(user.getPassword().getBytes()));
        userService.addUser(user);
    }

    /**
     * @return all users
     */
    @GetMapping("/all")
    private List getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * @param id User Id to be found
     * @return User related to the id
     */
    @GetMapping("/id/{id}")
    private User getUserById(@PathVariable int id) throws UserNotFoundException {
        return userService.getUserById(id);
    }
}
