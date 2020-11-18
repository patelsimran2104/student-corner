package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester5;
import java.util.List;

public interface Semester5Service {

    /**
     * @param result Semester5 object to insert in the database
     */
    void addResultForSemester5(Semester5 result);

    /**
     * @return List of all Semester5 in table category.
     */
    List<Semester5> getAllResultForSemester5();

    /**
     * @param id to find User
     * @return Semester5 for a particular ID.
     */
    List<Semester5> getAllResultForSemester5ByResultId(int id) throws ResultNotFoundException;
}
