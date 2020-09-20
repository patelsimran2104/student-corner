package com.university.studentcorner.keymapper;

import java.util.Map;

public class KeyValueMapper {
    private static final Object DEFAULT_VAL = null;

    public void setKeyValue(Map<String, String> map, String key, Object value, Object defaultVal) {
        if (value != null) {
            map.put(key, value.toString());
        } else if (value == null && defaultVal != null) {
            map.put(key, defaultVal.toString());
        }

    }

    public void setKeyValue(Map<String, String> map, String key, Object value) {

        setKeyValue(map,key,value,DEFAULT_VAL);

    }

    public String setValue(Object obj) {
        if(obj == null){
            return null;
        }
        return obj.toString();
    }

}
