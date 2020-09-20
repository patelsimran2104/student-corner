package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester1;

import java.util.List;

public interface Semester1Service {

    /**
     * @param result Semester1 object to insert in the database
     */
    void addResultForSemester1(Semester1 result);

    /**
     * @return List of all Semester1 in table category.
     */
    List<Semester1> getAllResultForSemester1();

    /**
     * @param id to find User
     * @return Semester1 for a particular ID.
     */
    List<Semester1> getAllResultForSemester1ByResultId(int id) throws ResultNotFoundException;
}
