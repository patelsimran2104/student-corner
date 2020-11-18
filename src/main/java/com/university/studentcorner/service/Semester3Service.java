package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester3;
import java.util.List;

public interface Semester3Service {

    /**
     * @param result Semester3 object to insert in the database
     */
    void addResultForSemester3(Semester3 result);

    /**
     * @return List of all Semester3 in table category.
     */
    List<Semester3> getAllResultForSemester3();

    /**
     * @param id to find User
     * @return Semester3 for a particular ID.
     */
    List<Semester3> getAllResultForSemester3ByResultId(int id) throws ResultNotFoundException;
}
