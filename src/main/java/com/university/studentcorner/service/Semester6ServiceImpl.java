package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester6;
import com.university.studentcorner.repository.Semester6Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Semester6ServiceImpl implements Semester6Service{

    @Autowired
    private Semester6Repository semester6Repository;
    /**
     * @param semester6 object to insert in the database
     */
    @Override
    public void addResultForSemester6(Semester6 semester6) {
        semester6Repository.save(semester6);
    }

    /**
     * @return List of all Semester6 in table category.
     */
    @Override
    public List<Semester6> getAllResultForSemester6() {
        return semester6Repository.findAll();
    }

    /**
     * @param id to find User
     * @return Semester6 for a particular ID.
     */
    @Override
    public List<Semester6> getAllResultForSemester6ByResultId(int id) throws ResultNotFoundException {
        return semester6Repository.getResultForSemester6ByResultId(id);
    }
}
