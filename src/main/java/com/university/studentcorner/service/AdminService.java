package com.university.studentcorner.service;

import com.university.studentcorner.exception.UserNotFoundException;
import com.university.studentcorner.model.Admin;

import java.util.List;

public interface AdminService {

    /**
     * @param admin object to insert in the database
     */
    void addUser(Admin admin);

    /**
     * @return List of all Users in table category.
     */
    List<Admin> getAllAdmin();

    /**
     * @param id to find User
     * @return User for a particular ID.
     */
    Admin getAdminById(int id) throws UserNotFoundException;
}
