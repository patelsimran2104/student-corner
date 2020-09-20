package com.university.studentcorner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_result")
@NamedQuery(name = "Result.findAll", query = "SELECT t FROM Result t")
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id", nullable = false, unique = true)
    @JsonIgnore
    private int resultId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User userId;

    @OneToMany
    @JoinColumn(name = "result_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Semester1> semester1;

    @OneToMany
    @JoinColumn(name = "result_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Semester2> semester2;

    @OneToMany
    @JoinColumn(name = "result_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Semester3> semester3;

    @OneToMany
    @JoinColumn(name = "result_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Semester4> semester4;

    @OneToMany
    @JoinColumn(name = "result_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Semester5> semester5;

    @OneToMany
    @JoinColumn(name = "result_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Semester6> semester6;

    @OneToMany
    @JoinColumn(name = "result_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Semester7> semester7;

    @OneToMany
    @JoinColumn(name = "result_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Semester8> semester8;

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public List<Semester1> getSemester1() {
        return semester1;
    }

    public void setSemester1(List<Semester1> semester1) {
        this.semester1 = semester1;
    }

    public List<Semester2> getSemester2() {
        return semester2;
    }

    public void setSemester2(List<Semester2> semester2) {
        this.semester2 = semester2;
    }

    public List<Semester3> getSemester3() {
        return semester3;
    }

    public void setSemester3(List<Semester3> semester3) {
        this.semester3 = semester3;
    }

    public List<Semester4> getSemester4() {
        return semester4;
    }

    public void setSemester4(List<Semester4> semester4) {
        this.semester4 = semester4;
    }

    public List<Semester5> getSemester5() {
        return semester5;
    }

    public void setSemester5(List<Semester5> semester5) {
        this.semester5 = semester5;
    }

    public List<Semester6> getSemester6() {
        return semester6;
    }

    public void setSemester6(List<Semester6> semester6) {
        this.semester6 = semester6;
    }

    public List<Semester7> getSemester7() {
        return semester7;
    }

    public void setSemester7(List<Semester7> semester7) {
        this.semester7 = semester7;
    }

    public List<Semester8> getSemester8() {
        return semester8;
    }

    public void setSemester8(List<Semester8> semester8) {
        this.semester8 = semester8;
    }
}
