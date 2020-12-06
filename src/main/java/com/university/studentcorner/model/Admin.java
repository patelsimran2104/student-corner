package com.university.studentcorner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_Admindata")
@NamedQuery(name = "Admindata.findAll", query = "SELECT t FROM Admin t")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "adminId")
//    @JsonIgnore
//    private int adminId;
//
//    @GeneratedValue()
//    private int requestId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminId", nullable = false, unique = true)
    @JsonIgnore
    private int adminId;

    @JoinColumn(name = "adminId")
    private String request;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "adminId")
    private String applicationId;

    @JoinColumn(name="adminId")
    private int transNo;

    public Admin() {

    }

    public Admin(int adminId, String request, String applicationId, int transNo) {
        this.adminId = adminId;
        this.request = request;
        this.applicationId = applicationId;
        this.transNo = transNo;
    }


    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public int getTransNo() {
        return transNo;
    }

    public void setTransNo(int transNo) {
        this.transNo = transNo;
    }
}
