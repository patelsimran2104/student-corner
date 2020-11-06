package com.university.studentcorner.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the tbl_user database table.
 */
@Entity
@Table(name = "tbl_user")
@NamedQuery(name = "User.findAll", query = "SELECT t FROM User t")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_type", nullable = false)
    private UserTypeEnum userType;

    @Column(name="role")
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "enrollment", nullable = false, unique = true)
    private String enrollment;

    @Column(name = "password", nullable = false)
    private String password;

    private String email;

    private String mobile;

    @Temporal(TemporalType.DATE)
    private Date dob;

    private String gender;

    private String category;

    private String parentsEmail;

    private String parentsMobile;

    private String address;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Result> result;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getParentsEmail() {
        return parentsEmail;
    }

    public void setParentsEmail(String parentsEmail) {
        this.parentsEmail = parentsEmail;
    }

    public String getParentsMobile() {
        return parentsMobile;
    }

    public void setParentsMobile(String parentsMobile) {
        this.parentsMobile = parentsMobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

}
