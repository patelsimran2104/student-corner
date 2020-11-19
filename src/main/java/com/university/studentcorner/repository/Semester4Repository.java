package com.university.studentcorner.repository;

import com.university.studentcorner.model.Semester4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Semester4Repository extends JpaRepository<Semester4, Integer>{
    @Query(value = "SELECT * FROM studentcornerdb.tbl_semester4 where tbl_semester4.result_id=?", nativeQuery = true)
    List<Semester4> getResultForSemester4ByResultId(int qid);
}
