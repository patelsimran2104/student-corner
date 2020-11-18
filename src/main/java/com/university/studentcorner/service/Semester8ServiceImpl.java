package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester8;
import com.university.studentcorner.repository.Semester8Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Semester8ServiceImpl implements Semester8Service {

    @Autowired
    private Semester8Repository semester8Repository;
    /**
     * @param semester8 object to insert in the database
     */
    @Override
    public void addResultForSemester8(Semester8 semester8) {
        semester8Repository.save(semester8);
    }

    /**
     * @return List of all Semester8 in table category.
     */
    @Override
    public List<Semester8> getAllResultForSemester8() {
        return semester8Repository.findAll();
    }

    /**
     * @param id to find User
     * @return Semester8 for a particular ID.
     */
    @Override
    public List<Semester8> getAllResultForSemester8ByResultId(int id) throws ResultNotFoundException {
        return semester8Repository.getResultForSemester8ByResultId(id);
    }
}
