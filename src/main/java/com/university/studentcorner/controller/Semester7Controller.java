package com.university.studentcorner.controller;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester7;
import com.university.studentcorner.service.Semester7Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semester7")
public class Semester7Controller {

    @Autowired
    private Semester7Service semester7Service;

    /**
     * @param semester7 insert
     */
    @PostMapping("/insert")
    private void insertResultForSemester2(@RequestBody Semester7 semester7) {
        semester7Service.addResultForSemester7(semester7);
    }

    /**
     * @return all result for semester 7
     */
    @GetMapping("/all")
    private List<Semester7> getAllResultForSemester7() {
        return semester7Service.getAllResultForSemester7();
    }

    /**
     * @param id User Id to be found
     * @return Semester7 related to the id
     */
    @GetMapping("/id/{id}")
    private List<Semester7> getResultForSemester7ByUserId(@PathVariable int id) throws ResultNotFoundException {
        return semester7Service.getAllResultForSemester7ByResultId(id);
    }

}

