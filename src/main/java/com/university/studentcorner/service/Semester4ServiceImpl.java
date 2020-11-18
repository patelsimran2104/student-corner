package com.university.studentcorner.service;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester4;
import com.university.studentcorner.repository.Semester2Repository;
import com.university.studentcorner.repository.Semester4Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Semester4ServiceImpl implements Semester4Service {

    @Autowired
    private Semester4Repository semester4Repository;
    /**
     * @param semester4 object to insert in the database
     */
    @Override
    public void addResultForSemester4(Semester4 semester4) {
        semester4Repository.save(semester4);
    }

    /**
     * @return List of all Semester4 in table category.
     */
    @Override
    public List<Semester4> getAllResultForSemester4() {
        return semester4Repository.findAll();
    }

    /**
     * @param id to find User
     * @return Semester4 for a particular ID.
     */
    @Override
    public List<Semester4> getAllResultForSemester4ByResultId(int id) throws ResultNotFoundException {
        return semester4Repository.getResultForSemester4ByResultId(id);
    }
}
