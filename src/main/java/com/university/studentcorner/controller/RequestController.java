
//For transcript Request API

package com.university.studentcorner.controller;
import com.university.studentcorner.model.Admin;
import com.university.studentcorner.model.User;
import com.university.studentcorner.repository.RequestRepository;
import com.university.studentcorner.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transcript")
public class RequestController  {

    @Autowired
    private RequestService requestService;

    private RequestRepository requestRepository;

    @GetMapping("/request")
    public Admin requestForTrans(@RequestParam String enrollment) throws Exception {

        Admin adminObj=null;
        System.out.println(enrollment);
        //System.out.println(id);
        String request = "1721BECE3011";
        int transNo=2;
        adminObj=requestService.saveRequestAndTransNo(request,transNo);
//        Admin a = new Admin();
//        a.setRequest(enrollment);
//        requestRepository.save(a);

        System.out.println("saved successfully");

        return adminObj;
    }

//    @GetMapping("/id/{id}")
//    public Admin sendAppId(@PathVariable String id){
//        System.out.println(id);
//        Admin adminObj=null;
//        adminObj =requestService.sendApplicationId(id);
//        return adminObj;
//    }
}
