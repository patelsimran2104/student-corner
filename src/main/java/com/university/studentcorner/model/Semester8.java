package com.university.studentcorner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_semester8")
@NamedQuery(name = "Semester8.findAll", query = "SELECT t FROM Semester8 t")
public class Semester8 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semester8_id")
    @JsonIgnore
    private int semester8Id;

    @ManyToOne
    @JoinColumn(name = "result_id")
    @JsonIgnore
    private Result resultId;

    private String subject;

    private String grade;

    public int getSemester8Id() {
        return semester8Id;
    }

    public void setSemester8Id(int semester8Id) {
        this.semester8Id = semester8Id;
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
