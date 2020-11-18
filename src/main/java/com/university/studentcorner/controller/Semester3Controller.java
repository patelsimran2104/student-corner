package com.university.studentcorner.controller;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester3;
import com.university.studentcorner.service.Semester3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semester3")
public class Semester3Controller {

    @Autowired
    private Semester3Service semester3Service;

    /**
     * @param semester3 insert
     */
    @PostMapping("/insert")
    private void insertResultForSemester3(@RequestBody Semester3 semester3) {
        semester3Service.addResultForSemester3(semester3);
    }

    /**
     * @return all result for semester 3
     */
    @GetMapping("/all")
    private List<Semester3> getAllResultForSemester3() {
        return semester3Service.getAllResultForSemester3();
    }

    /**
     * @param id User Id to be found
     * @return Semester3 related to the id
     */
    @GetMapping("/id/{id}")
    private List<Semester3> getResultForSemester3ByUserId(@PathVariable int id) throws ResultNotFoundException {
        return semester3Service.getAllResultForSemester3ByResultId(id);
    }

}

