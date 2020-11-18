package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester3;
import com.university.studentcorner.repository.Semester3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Semester3ServiceImpl implements Semester3Service {

    @Autowired
    private Semester3Repository semester3Repository;

    /**
     * @param semester3 object to insert in the database
     */
    @Override
    public void addResultForSemester3(Semester3 semester3) {
        semester3Repository.save(semester3);
    }

    /**
     * @return List of all Semester3 in table category.
     */
    @Override
    public List<Semester3> getAllResultForSemester3() {
        return semester3Repository.findAll();
    }

    /**
     * @param id to find User
     * @return Semester3 for a particular ID.
     */
    @Override
    public List<Semester3> getAllResultForSemester3ByResultId(int id) throws ResultNotFoundException {
        return semester3Repository.getResultForSemester3ByResultId(id);
    }
}
