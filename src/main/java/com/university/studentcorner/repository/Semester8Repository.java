package com.university.studentcorner.repository;

import com.university.studentcorner.model.Semester8;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Semester8Repository extends JpaRepository {
    @Query(value = "SELECT * FROM studentcornerdb.tbl_semester8 where tbl_semester8.result_id=?", nativeQuery = true)
    List<Semester8> getResultForSemester8ByResultId(int qid);
}
