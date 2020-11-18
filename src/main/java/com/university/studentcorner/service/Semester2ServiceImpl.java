package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.exception.UserNotFoundException;
import com.university.studentcorner.model.Semester2;
import com.university.studentcorner.repository.Semester2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Semester2ServiceImpl implements Semester2Service {

    @Autowired
    private Semester2Repository semester2Repository;

    /**
     * @param semester2 object to insert in the database
     */
    @Override
    public void addResultForSemester2(Semester2 semester2) {
        semester2Repository.save(semester2);
    }

    /**
     * @return List of all Semester1 in table category.
     */
    @Override
    public List<Semester2> getAllResultForSemester2() {
        return semester2Repository.findAll();
    }

    /**
     * @param id to find User
     * @return Semester2 for a particular ID
     * @throws UserNotFoundException if user id does not exist
     */
    @Override
    public List<Semester2> getAllResultForSemester2ByResultId(int id) throws ResultNotFoundException {
        return semester2Repository.getResultForSemester2ByResultId(id);
    }
}
