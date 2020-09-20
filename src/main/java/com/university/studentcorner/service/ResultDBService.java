package com.university.studentcorner.service;

import com.university.studentcorner.repository.ResultDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultDBService {

    @Autowired
    private ResultDAO resultDAO;


}
