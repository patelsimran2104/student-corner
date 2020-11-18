package com.university.studentcorner.controller;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester6;
import com.university.studentcorner.service.Semester6Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semester6")
public class Semester6Controller {

    @Autowired
    private Semester6Service semester6Service;

    /**
     * @param semester6 insert
     */
    @PostMapping("/insert")
    private void insertResultForSemester6(@RequestBody Semester6 semester6) {
        semester6Service.addResultForSemester6(semester6);
    }

    /**
     * @return all result for semester 6
     */
    @GetMapping("/all")
    private List<Semester6> getAllResultForSemester6() {
        return semester6Service.getAllResultForSemester6();
    }

    /**
     * @param id User Id to be found
     * @return Semester2 related to the id
     */
    @GetMapping("/id/{id}")
    private List<Semester6> getResultForSemester6ByUserId(@PathVariable int id) throws ResultNotFoundException {
        return semester6Service.getAllResultForSemester6ByResultId(id);
    }

}

