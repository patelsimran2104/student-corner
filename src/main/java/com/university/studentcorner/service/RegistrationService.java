package com.university.studentcorner.service;

import com.university.studentcorner.model.User;

public interface RegistrationService {

    User fetchUserByEmailIdAndEnrollment(String emailId, String enrollment);
    //
    //
}
