package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester4;
import java.util.List;

public interface Semester4Service {

    /**
     * @param result Semester4 object to insert in the database
     */
    void addResultForSemester4(Semester4 result);

    /**
     * @return List of all Semester4 in table category.
     */
    List<Semester4> getAllResultForSemester4();

    /**
     * @param id to find User
     * @return Semester4 for a particular ID.
     */
    List<Semester4> getAllResultForSemester4ByResultId(int id) throws ResultNotFoundException;
}
