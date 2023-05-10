package com.cnu.real_coding_server.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity(name = "syllabuss")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Syllabus extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @Setter
    private String name;

    @Column
    @Setter
    private String year;

    @Column
    @Setter
    private Integer grade;

    @Column
    @Setter
    private String department;

    @Column
    @Setter
    private String subjectNum;

    @Column
    @Setter
    private String completionDiv;

    @Column
    @Setter
    private Integer credit;

    @Builder
    private Syllabus(String name, // 과목명
                     String year, // 년도
                     Integer grade, // 학년
                     String department, //학과
                     String subjectNum, // 과목번호
                     String completionDiv, // 이수구분
                     Integer credit) {
        this.name = name;
        this.year = year;
        this.grade = grade;
        this.department = department;
        this.subjectNum = subjectNum;
        this.completionDiv = completionDiv;
        this.credit = credit;
    }
}
