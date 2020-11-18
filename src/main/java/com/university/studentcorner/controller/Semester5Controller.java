package com.university.studentcorner.controller;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester5;
import com.university.studentcorner.service.Semester5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semester5")
public class Semester5Controller {

    @Autowired
    private Semester5Service semester5Service;

    /**
     * @param semester5 insert
     */
    @PostMapping("/insert")
    private void insertResultForSemester5(@RequestBody Semester5 semester5) {
        semester5Service.addResultForSemester5(semester5);
    }

    /**
     * @return all result for semester 2
     */
    @GetMapping("/all")
    private List<Semester5> getAllResultForSemester5() {
        return semester5Service.getAllResultForSemester5();
    }

    /**
     * @param id User Id to be found
     * @return Semester2 related to the id
     */
    @GetMapping("/id/{id}")
    private List<Semester5> getResultForSemester5ByUserId(@PathVariable int id) throws ResultNotFoundException {
        return semester5Service.getAllResultForSemester5ByResultId(id);
    }

}

