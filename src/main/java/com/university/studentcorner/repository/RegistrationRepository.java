package com.university.studentcorner.repository;

import com.university.studentcorner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository  extends JpaRepository<User, Integer> {

    @Query(value = "select * from studentcornerdb.tbl_user where email=? and enrollment=?;",nativeQuery = true)
    public User findByEmailAndEnrollment(String email, String enrollment);

}
