package com.university.studentcorner.repository;

import com.university.studentcorner.model.Semester2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Semester2Repository extends JpaRepository<Semester2, Integer>{

    @Query(value = "SELECT * FROM studentcornerdb.tbl_semester2 where tbl_semester2.result_id=?", nativeQuery = true)
    List<Semester2> getResultForSemester2ByResultId(int qid);
}
