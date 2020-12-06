package com.university.studentcorner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_Admindata")
@NamedQuery(name = "Admindata.findAll", query = "SELECT t FROM Admin t")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminId")
    @JsonIgnore
    private int adminId;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "applicationId")
    private String applicationId;

    private String request;

    private String pending;

    private Result result;

    private String no_of_trans;

    public String getNo_of_trans() {
        return no_of_trans;
    }

    public void setNo_of_trans(String no_of_trans) {
        this.no_of_trans = no_of_trans;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
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
