package com.university.studentcorner.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UserTypeEnum {

    UNIVERSITY_ADMIN("University Admin"),

    COLLEGE_ADMIN("College Admin"),

    STUDENT("Student");

    private String value;
    UserTypeEnum(String value) {
        this.value = value;
    }
    @JsonCreator
    public static UserTypeEnum fromValue(String text) {
        for (UserTypeEnum b : UserTypeEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

}
