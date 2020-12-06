package com.university.studentcorner.service;

import com.university.studentcorner.model.Admin;
import com.university.studentcorner.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements RequestService{

    @Autowired
    public RequestRepository requestRepository;

    public Admin admin;


    @Override
    public void saveEnrollmentInAdmin(String enrollment) {
        admin.setRequest(enrollment);
        requestRepository.save(admin);
    }

    @Override
    public Admin sendApplicationId(String request) {
        return requestRepository.getApplicationIdForUserByRequest(request);
    }


}
