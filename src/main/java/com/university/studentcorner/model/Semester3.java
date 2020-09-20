package com.university.studentcorner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_semester3")
@NamedQuery(name = "Semester3.findAll", query = "SELECT t FROM Semester3 t")
public class Semester3 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semester3_id")
    @JsonIgnore
    private int semester3Id;

    @ManyToOne
    @JoinColumn(name = "result_id")
    @JsonIgnore
    private Result resultId;

    private String subject;

    private String grade;

    public int getSemester3Id() {
        return semester3Id;
    }

    public void setSemester3Id(int semester3Id) {
        this.semester3Id = semester3Id;
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
