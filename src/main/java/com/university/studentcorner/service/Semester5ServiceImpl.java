package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester5;
import com.university.studentcorner.repository.Semester5Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Semester5ServiceImpl implements Semester5Service{

    @Autowired
    private Semester5Repository semester5Repository;
    /**
     * @param semester5 object with values to save in the database
     */
    @Override
    public void addResultForSemester5(Semester5 semester5) {
        semester5Repository.save(semester5);
    }

    /**
     * @return List of all Semester5 in table category.
     */
    @Override
    public List<Semester5> getAllResultForSemester5() {
        return semester5Repository.findAll();
    }

    /**
     * @param id to find User
     * @return Semester5 for a particular ID.
     */
    @Override
    public List<Semester5> getAllResultForSemester5ByResultId(int id) throws ResultNotFoundException {
        return semester5Repository.getResultForSemester5ByResultId(id);
    }
}
