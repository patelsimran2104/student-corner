package com.university.studentcorner.repository;

import com.university.studentcorner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository  extends JpaRepository<User, Integer> {

    public User findByUserNameAndPassword(String emailId, String enrollmentNo);

}
