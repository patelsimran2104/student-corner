
//For transcript Request API

package com.university.studentcorner.controller;
import com.university.studentcorner.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController  {

    @PostMapping("/request")
    public void requestForTrans(@RequestBody User user){
        String tempId = user.getEnrollment();


    }

}
