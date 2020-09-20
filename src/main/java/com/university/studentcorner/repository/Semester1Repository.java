package com.university.studentcorner.repository;

import com.university.studentcorner.model.Semester1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Semester1Repository extends JpaRepository<Semester1, Integer> {

    @Query(value = "SELECT * FROM studentcorner.tbl_semester1 where tbl_semester1.result_id=?", nativeQuery = true)
    List<Semester1> getResultForSemester1ByResultId(int qid);
}
