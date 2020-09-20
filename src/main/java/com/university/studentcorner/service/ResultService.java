package com.university.studentcorner.service;

import com.university.studentcorner.exception.UserNotFoundException;
import com.university.studentcorner.model.Result;

import java.util.List;

public interface ResultService {

    /**
     * @param result Result object to insert in the database
     */
    void addResult(Result result);

    /**
     * @return List of all Results in table category.
     */
    List<Result> getAllResult();

    /**
     * @param id to find User
     * @return Result for a particular ID.
     */
    Result getResultByUserId(int id) throws UserNotFoundException;
}
