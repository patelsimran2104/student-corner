
//For transcript Request API

package com.university.studentcorner.controller;
import com.university.studentcorner.model.Admin;
import com.university.studentcorner.model.User;
import com.university.studentcorner.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transcript")
public class RequestController  {

    @Autowired
    private RequestService requestService;


    @PostMapping("/request")
    public void requestForTrans(@RequestBody String enrollment) throws Exception {
        System.out.println(enrollment);

        requestService.saveEnrollmentInAdmin(enrollment);
        System.out.println("saved successfully");
    }

    @GetMapping("/id/{id}")
    public Admin sendAppId(@PathVariable String id){
        System.out.println(id);
        Admin adminObj=null;
        adminObj =requestService.sendApplicationId(id);
        return adminObj;
    }
}
