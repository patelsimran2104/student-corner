package com.university.studentcorner.repository;

import com.university.studentcorner.keymapper.ResultKeyValueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ResultDAO extends BaseDAO{

    @Autowired
    private ResultKeyValueMapper resultKeyValueMapper;

    protected long getResultById(String id) {
        return jdbcTemplate.queryForObject("select * from tbl_result r where r.result_id=?", new Object [] {id}, Long.class);
    }

}
