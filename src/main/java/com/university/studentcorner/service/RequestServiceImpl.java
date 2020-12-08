package com.university.studentcorner.service;

import com.university.studentcorner.model.Admin;
import com.university.studentcorner.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements RequestService{

    @Autowired
    public RequestRepository requestRepository;

//    @Autowired
//    public Admin admin;

//    @Override
//    public void saveEnrollmentAndId(String enrollment, Integer id) {
//        admin.setRequest(enrollment);
//        admin.setTransNo(id);
//
//        requestRepository.save(admin);
//    }

//    @Override
//    public Admin saveRequestAndTransNo(String request, int transNo) {
//
//        Admin a = new Admin();
//        a.setRequest(request);
//        a.setTransNo(transNo);
//
//        requestRepository.save(a);
//
//        return requestRepository.getApplicationIdByRequest(request);
//
//    }


//    @Override
//    public void saveEnrollmentInAdmin(String enrollment) {
//        admin.setRequest(enrollment);
//        requestRepository.save(admin);
//    }

    @Override
    public Admin sendApplicationId(String request) {
        return requestRepository.getApplicationIdForUserByRequest(request);
    }

}
