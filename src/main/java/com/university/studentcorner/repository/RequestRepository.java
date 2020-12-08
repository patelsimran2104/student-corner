package com.university.studentcorner.repository;

import com.university.studentcorner.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Admin,Integer> {

    @Query(value = "select * from studentcornerdb.tbl_admindata where request=?",nativeQuery = true)
    public Admin getApplicationIdForUserByRequest(String enrollment);
}
