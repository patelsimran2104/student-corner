
//For transcript Request API

package com.university.studentcorner.controller;
import com.university.studentcorner.model.Admin;
import com.university.studentcorner.model.Result;
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

//    @GetMapping("/request")
//    public Admin requestForTrans(@RequestParam User user,int id) throws Exception {
//
//        Admin adminObj=null;
//        System.out.println(user.getEnrollment());
//        System.out.println(id);
//        String request = user.getEnrollment();
//        int transNo = id;
//        //int transNo=2;
//        adminObj=requestService.saveRequestAndTransNo(request,transNo);
//        Admin a = new Admin();
//        a.setRequest(enrollment);
//        requestRepository.save(a);
//
//        System.out.println("saved successfully");
//
//        return adminObj;
//    }


    /**
     * @param admin insert
     */
    @PostMapping("/insert")
    private Admin insertTranscript(@RequestBody Admin admin) {
        requestService.saveEnrollmentInAdmin(admin);
        return requestService.sendApplicationId(admin.getRequest());
    }

    @GetMapping("/id/{id}")
    public Admin sendAppId(@PathVariable String id){
        System.out.println(id);
        Admin adminObj=null;
        adminObj =requestService.sendApplicationId(id);
        return adminObj;
    }
}
