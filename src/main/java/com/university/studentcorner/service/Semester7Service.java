package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester7;

import java.util.List;

public interface Semester7Service {

    /**
     * @param result Semester7 object to insert in the database
     */
    void addResultForSemester7(Semester7 result);

    /**
     * @return List of all Semester7 in table category.
     */
    List<Semester7> getAllResultForSemester7();

    /**
     * @param id to find User
     * @return Semester7 for a particular ID.
     */
    List<Semester7> getAllResultForSemester7ByResultId(int id) throws ResultNotFoundException;
}
