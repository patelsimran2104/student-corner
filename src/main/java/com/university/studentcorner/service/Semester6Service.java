package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester6;

import java.util.List;

public interface Semester6Service {

    /**
     * @param result Semester6 object to insert in the database
     */
    void addResultForSemester6(Semester6 result);

    /**
     * @return List of all Semester6 in table category.
     */
    List<Semester6> getAllResultForSemester6();

    /**
     * @param id to find User
     * @return Semester6 for a particular ID.
     */
    List<Semester6> getAllResultForSemester6ByResultId(int id) throws ResultNotFoundException;
}
