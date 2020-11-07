package com.university.studentcorner.repository;

import com.university.studentcorner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    @Query(value = "select u from studentcornerdb.tbl_user where u.email=:email")
//    public User getUserByUserName(@Param("email") String email);
//    @Query(value = "select t from studentcornerdb.tbl_user where t.email=:email",nativeQuery = true)
//    public User getUserByUserName(@Param("email") String email);
}
