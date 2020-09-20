package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.exception.UserNotFoundException;
import com.university.studentcorner.model.Semester1;
import com.university.studentcorner.repository.Semester1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Semester1ServiceImpl implements Semester1Service{

    @Autowired
    private Semester1Repository semester1Repository;

    /**
     * @param semester1 object with values to save in database
     */
    @Override
    public void addResultForSemester1(Semester1 semester1) {
        semester1Repository.save(semester1);
    }

    /**
     * @return List of all results for semester 1.
     */
    @Override
    public List<Semester1> getAllResultForSemester1() {
        return semester1Repository.findAll();
    }

    /**
     * @param id to find Result
     * @return Object of Semester1
     * @throws UserNotFoundException if user id does not exist
     */
    @Override
    public List<Semester1> getAllResultForSemester1ByResultId(int id) throws ResultNotFoundException {
        return semester1Repository.getResultForSemester1ByResultId(id);
    }
}
