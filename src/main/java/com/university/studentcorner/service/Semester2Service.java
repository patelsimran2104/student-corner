package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester2;
import java.util.List;

public interface Semester2Service {

    /**
     * @param result Semester2 object to insert in the database
     */
    void addResultForSemester2(Semester2 result);

    /**
     * @return List of all Semester2 in table category.
     */
    List<Semester2> getAllResultForSemester2();

    /**
     * @param id to find User
     * @return Semester2 for a particular ID.
     */
    List<Semester2> getAllResultForSemester2ByResultId(int id) throws ResultNotFoundException;
}
