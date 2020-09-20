package com.university.studentcorner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_semester6")
@NamedQuery(name = "Semester6.findAll", query = "SELECT t FROM Semester6 t")
public class Semester6 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semester6_id")
    @JsonIgnore
    private int semester6Id;

    @ManyToOne
    @JoinColumn(name = "result_id")
    @JsonIgnore
    private Result resultId;

    private String subject;

    private String grade;

    public int getSemester6Id() {
        return semester6Id;
    }

    public void setSemester6Id(int semester6Id) {
        this.semester6Id = semester6Id;
    }

    public Result getResultId() {
        return resultId;
    }

    public void setResultId(Result resultId) {
        this.resultId = resultId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
