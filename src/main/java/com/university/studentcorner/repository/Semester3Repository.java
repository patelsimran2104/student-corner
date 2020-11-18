package com.university.studentcorner.repository;

import com.university.studentcorner.model.Semester3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Semester3Repository extends JpaRepository {
    @Query(value = "SELECT * FROM studentcornerdb.tbl_semester3 where tbl_semester3.result_id=?", nativeQuery = true)
    List<Semester3> getResultForSemester3ByResultId(int qid);
}
