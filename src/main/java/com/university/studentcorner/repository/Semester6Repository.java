package com.university.studentcorner.repository;

import com.university.studentcorner.model.Semester6;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Semester6Repository extends JpaRepository {
    @Query(value = "SELECT * FROM studentcornerdb.tbl_semester6 where tbl_semester6.result_id=?", nativeQuery = true)
    List<Semester6> getResultForSemester6ByResultId(int qid);
}
