package com.university.studentcorner.repository;

import com.university.studentcorner.model.Semester5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Semester5Repository extends JpaRepository<Semester5, Integer>{
    @Query(value = "SELECT * FROM studentcornerdb.tbl_semester5 where tbl_semester5.result_id=?", nativeQuery = true)
    List<Semester5> getResultForSemester5ByResultId(int qid);
}
