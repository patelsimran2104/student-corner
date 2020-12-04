package com.university.studentcorner.model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tbl_Admin")
@NamedQuery(name = "Admin.findAll", query = "SELECT t FROM Admin t")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    private String request;

    private String pending;

    private Result result;

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


}
