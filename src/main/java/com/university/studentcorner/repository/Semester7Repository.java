package com.university.studentcorner.repository;

import com.university.studentcorner.model.Semester7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Semester7Repository extends JpaRepository {
    @Query(value = "SELECT * FROM studentcornerdb.tbl_semester7 where tbl_semester7.result_id=?", nativeQuery = true)
    List<Semester7> getResultForSemester7ByResultId(int qid);
}
