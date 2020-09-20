package com.university.studentcorner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_semester4")
@NamedQuery(name = "Semester4.findAll", query = "SELECT t FROM Semester4 t")
public class Semester4 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semester4_id")
    @JsonIgnore
    private int semester4Id;

    @ManyToOne
    @JoinColumn(name = "result_id")
    @JsonIgnore
    private Result resultId;

    private String subject;

    private String grade;

    public int getSemester4Id() {
        return semester4Id;
    }

    public void setSemester4Id(int semester4Id) {
        this.semester4Id = semester4Id;
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
