package com.university.studentcorner.repository;

import com.university.studentcorner.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Admin,String> {

    Admin getApplicationIdByRequest(String request);
}
