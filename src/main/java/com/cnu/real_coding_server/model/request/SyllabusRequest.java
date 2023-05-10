package com.cnu.real_coding_server.model.request;

import com.cnu.real_coding_server.entity.Syllabus;

import lombok.Getter;
@Getter
public class SyllabusRequest {
    private String name;

    private String year;

    private Integer grade;

    private String department;

    private String subjectNum;

    private String completionDiv;

    private Integer credit;

    public Syllabus toEntity() {
        return Syllabus.builder()
                .name(name)
                .year(year)
                .grade(grade)
                .department(department)
                .subjectNum(subjectNum)
                .completionDiv(completionDiv)
                .credit(credit)
                .build();
    }
}
