package com.university.studentcorner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_semester1")
@NamedQuery(name = "Semester1.findAll", query = "SELECT t FROM Semester1 t")
public class Semester1 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semester1_id")
    @JsonIgnore
    private int semester1Id;

    @ManyToOne
    @JoinColumn(name = "result_id")
    @JsonIgnore
    private Result resultId;

    private String subject;

    private String grade;

    public int getSemester1Id() {
        return semester1Id;
    }

    public void setSemester1Id(int semester1Id) {
        this.semester1Id = semester1Id;
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
