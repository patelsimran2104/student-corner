package com.university.studentcorner.controller;

import com.university.studentcorner.exception.UserNotFoundException;
import com.university.studentcorner.model.Result;
import com.university.studentcorner.service.ResultService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @Autowired
    private ModelMapper modelMapper = new ModelMapper();

    /**
     * @param result insert
     */
    @PostMapping("/insert")
    private void insertUser(@RequestBody Result result) {
        resultService.addResult(result);
    }

    /**
     * @return all users
     */
    @GetMapping("/all")
    private List<Result> getAllResult() {
        return resultService.getAllResult();
    }

    /**
     * @param id User Id to be found
     * @return Result related to the id
     */
    @GetMapping("/id/{id}")
    private Result getResultByUserId(@PathVariable int id) throws UserNotFoundException {
        return resultService.getResultByUserId(id);
    }

//    /**
//     * @param userId
//     * @return userId, username and userType for a given userId
//     * @throws UserNotFoundException
//     */
//    @GetMapping("/userdto/id/{userId}")
//    private UserDTO getUsernameByUserId(@PathVariable int userId) throws UserNotFoundException{
//        Type user = new TypeToken<UserDTO>() {
//        }.getType();
//        return modelMapper.map(userService.getUserById(userId), user);
//
//    }
}
