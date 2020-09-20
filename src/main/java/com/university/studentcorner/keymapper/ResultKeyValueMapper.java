package com.university.studentcorner.keymapper;

import com.university.studentcorner.model.Result;
import com.university.studentcorner.model.Semester;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ResultKeyValueMapper extends KeyValueMapper {

    public Map<String, String> resultKeyMapper(Result result) {
        Map<String, String> map = new HashMap<String, String>();
        if (result != null) {
            Semester semester = result.getSemester();
            if (semester != null) {

                map.put("result.semester.subject", semester.getSubject());
                map.put("result.semester.grade", semester.getGrade());

            }
        }
        return map;
    }
}
