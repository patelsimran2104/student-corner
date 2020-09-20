package com.university.studentcorner.controller;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester1;
import com.university.studentcorner.service.Semester1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semester1")
public class Semester1Controller {

    @Autowired
    private Semester1Service semester1Service;

    /**
     * @param semester1 insert
     */
    @PostMapping("/insert")
    private void insertResultForSemester1(@RequestBody Semester1 semester1) {
        semester1Service.addResultForSemester1(semester1);
    }

    /**
     * @return all result for semester 1
     */
    @GetMapping("/all")
    private List<Semester1> getAllResultForSemester1() {
        return semester1Service.getAllResultForSemester1();
    }

    /**
     * @param id User Id to be found
     * @return Semester1 related to the id
     */
    @GetMapping("/id/{id}")
    private List<Semester1> getResultForSemester1ByUserId(@PathVariable int id) throws ResultNotFoundException {
        return semester1Service.getAllResultForSemester1ByResultId(id);
    }

}
