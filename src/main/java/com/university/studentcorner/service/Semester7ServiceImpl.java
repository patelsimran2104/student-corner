package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.exception.UserNotFoundException;
import com.university.studentcorner.model.Semester7;
import com.university.studentcorner.repository.Semester7Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Semester7ServiceImpl implements Semester7Service {

    @Autowired
    private Semester7Repository semester7Repository;
    /**
     * @param semester7 object to insert in the database
     */
    @Override
    public void addResultForSemester7(Semester7 semester7) {
        semester7Repository.save(semester7);
    }

    /**
     * @return List of all Semester7 in table category.
     */
    @Override
    public List<Semester7> getAllResultForSemester7() {
        return semester7Repository.findAll();
    }

    /**
     * @param id to find User
     * @return Semester7 for a particular ID.
     * @throws UserNotFoundException if user id does not exist
     */
    @Override
    public List<Semester7> getAllResultForSemester7ByResultId(int id) throws ResultNotFoundException {
        return semester7Repository.getResultForSemester7ByResultId(id);
    }
}
