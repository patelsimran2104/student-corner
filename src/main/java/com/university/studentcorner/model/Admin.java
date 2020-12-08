package com.university.studentcorner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_admindata")
@NamedQuery(name = "Admin.findAll", query = "SELECT t FROM Admin t")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminId")
    @JsonIgnore
    private int adminId;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "applicationId", nullable = false, unique = true)
    private String applicationId;

    @Column(name = "request", nullable = false)
    private String request;

    @Column(name = "no_of_trans")
    private String no_of_trans;

    public String getNo_of_trans() {
        return no_of_trans;
    }

    public void setNo_of_trans(String no_of_trans) {
        this.no_of_trans = no_of_trans;
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

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }


}
