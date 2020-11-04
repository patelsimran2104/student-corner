package com.university.studentcorner.service;

import com.university.studentcorner.model.User;
import com.university.studentcorner.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    public RegistrationRepository registrationRepository;

    @Override
    public User fetchUserByEmailIdAndEnrollment(String emailId, String enrollment) {
        return registrationRepository.findByEmailAndEnrollment(emailId, enrollment);
    }


}
