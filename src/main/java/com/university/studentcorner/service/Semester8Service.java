package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester8;

import java.util.List;

public interface Semester8Service {

    /**
     * @param result Semester8 object to insert in the database
     */
    void addResultForSemester8(Semester8 result);

    /**
     * @return List of all Semester8 in table category.
     */
    List<Semester8> getAllResultForSemester8();

    /**
     * @param id to find User
     * @return Semester8 for a particular ID.
     */
    List<Semester8> getAllResultForSemester8ByResultId(int id) throws ResultNotFoundException;
}
