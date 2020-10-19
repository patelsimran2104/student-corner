package com.university.studentcorner.service;

import com.university.studentcorner.model.User;

public interface RegistrationService {

    User fetchUserByUserNameAndPassword(String emailId, String password);
    //
}
