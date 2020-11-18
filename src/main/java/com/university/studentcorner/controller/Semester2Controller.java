package com.university.studentcorner.controller;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester2;
import com.university.studentcorner.service.Semester2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semester2")
public class Semester2Controller {

    @Autowired
    private Semester2Service semester2Service;

    /**
     * @param semester2 insert
     */
    @PostMapping("/insert")
    private void insertResultForSemester2(@RequestBody Semester2 semester2) {
        semester2Service.addResultForSemester2(semester2);
    }

    /**
     * @return all result for semester 2
     */
    @GetMapping("/all")
    private List<Semester2> getAllResultForSemester2() {
        return semester2Service.getAllResultForSemester2();
    }

    /**
     * @param id User Id to be found
     * @return Semester2 related to the id
     */
    @GetMapping("/id/{id}")
    private List<Semester2> getResultForSemester2ByUserId(@PathVariable int id) throws ResultNotFoundException {
        return semester2Service.getAllResultForSemester2ByResultId(id);
    }

}

