package com.university.studentcorner.controller;

import com.university.studentcorner.exception.ResultNotFoundException;
import com.university.studentcorner.model.Semester4;
import com.university.studentcorner.service.Semester4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semester4")
public class Semester4Controller {

    @Autowired
    private Semester4Service semester4Service;

    /**
     * @param semester4 insert
     */
    @PostMapping("/insert")
    private void insertResultForSemester4(@RequestBody Semester4 semester4) {
        semester4Service.addResultForSemester4(semester4);
    }

    /**
     * @return all result for semester 4
     */
    @GetMapping("/all")
    private List<Semester4> getAllResultForSemester4() {
        return semester4Service.getAllResultForSemester4();
    }

    /**
     * @param id User Id to be found
     * @return Semester4 related to the id
     */
    @GetMapping("/id/{id}")
    private List<Semester4> getResultForSemester4ByUserId(@PathVariable int id) throws ResultNotFoundException {
        return semester4Service.getAllResultForSemester4ByResultId(id);
    }

}

