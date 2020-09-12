package com.university.studentcorner.service;

import com.university.studentcorner.exception.UserNotFoundException;
import com.university.studentcorner.model.User;

import java.util.List;

public interface UserService {

    /**
     * @param user User object to insert in the database
     */
    void addUser(User user);

    /**
     * @return List of all Users in table category.
     */
    List<User> getAllUsers();

    /**
     * @param id to find User
     * @return User for a particular ID.
     */
    User getUserById(int id) throws UserNotFoundException;
}
