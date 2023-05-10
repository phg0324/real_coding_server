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
    private String OPEN_YR;
    // 학기
    @Column
    @Setter
    private String SHTM;

    // 대상 학년
    @Column
    @Setter
    private int TRGT_SHYR;

    // 조직 분류
    @Column
    @Setter
    private String ORGN_CLSF_CD;

    // 단대
    @Column
    @Setter
    private String COLG;

    // 학과
    @Column
    @Setter
    private String DEGR_NM_SUST;

    // 과목 명
    @Column
    @Setter
    private String OPEN_SBJT_NM;

    // 과목 분반
    @Column
    @Setter
    private String OPEN_DCLSS;

    // 이수 구분
    @Column
    @Setter
    private String CPTN_DIV_NM;

    // 학점
    @Column
    @Setter
    private int PNT;

    // 이론 시수
    @Column
    @Setter
    private int THEO_TMCNT;

    // 실습 시수
    @Column
    @Setter
    private int PRAC_TMCNT;

    // 수업 개요
    @Column
    @Setter
    private String LSN_SMRY;

    // 교과 목표
    @Column
    @Setter
    private String SBJT_SHT;

    // 교재
    @Column
    @Setter
    private String TEMT_REF_LITRT;

    // 참고 문헌
    @Column
    @Setter
    private String REF_BOOK;

    // 선수 학습 내용
    @Column
    @Setter
    private String PRE_LRN_CN;

    @Builder
    private Syllabus(String OPEN_YR,
                     String SHTM,
                     int TRGT_SHYR,
                     String ORGN_CLSF_CD,
                     String COLG,
                     String DEGR_NM_SUST,
                     String OPEN_DCLSS,
                     String CPTN_DIV_NM,
                     int PNT,
                     int THEO_TMCNT,
                     int PRAC_TMCNT,
                     String LSN_SMRY,
                     String SBJT_SHT,
                     String TEMT_REF_LITRT,
                     String REF_BOOK,
                     String PRE_LRN_CN) {
        this.SHTM = SHTM;
        this.TRGT_SHYR = TRGT_SHYR;
        this.ORGN_CLSF_CD = ORGN_CLSF_CD;
        this.COLG = COLG;
        this.DEGR_NM_SUST = DEGR_NM_SUST;
        this.OPEN_DCLSS = OPEN_DCLSS;
        this.CPTN_DIV_NM = CPTN_DIV_NM;
        this.PNT = PNT;
        this.THEO_TMCNT= THEO_TMCNT;
        this.PRAC_TMCNT = PRAC_TMCNT;
        this.LSN_SMRY = LSN_SMRY;
        this.SBJT_SHT = SBJT_SHT;
        this.TEMT_REF_LITRT = TEMT_REF_LITRT;
        this.REF_BOOK = REF_BOOK;
        this.PRE_LRN_CN = PRE_LRN_CN;
    }
}
