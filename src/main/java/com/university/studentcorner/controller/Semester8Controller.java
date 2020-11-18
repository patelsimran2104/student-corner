package com.university.studentcorner.controller;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester8;
import com.university.studentcorner.service.Semester8Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semester8")
public class Semester8Controller {

    @Autowired
    private Semester8Service semester8Service;

    /**
     * @param semester8 insert
     */
    @PostMapping("/insert")
    private void insertResultForSemester8(@RequestBody Semester8 semester8) {
        semester8Service.addResultForSemester8(semester8);
    }

    /**
     * @return all result for semester 8
     */
    @GetMapping("/all")
    private List<Semester8> getAllResultForSemester8() {
        return semester8Service.getAllResultForSemester8();
    }

    /**
     * @param id User Id to be found
     * @return Semester8 related to the id
     */
    @GetMapping("/id/{id}")
    private List<Semester8> getResultForSemester8ByUserId(@PathVariable int id) throws ResultNotFoundException {
        return semester8Service.getAllResultForSemester8ByResultId(id);
    }

}

