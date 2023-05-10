package com.cnu.real_coding_server.model.request;

import com.cnu.real_coding_server.entity.Syllabus;

import lombok.Getter;
@Getter
public class SyllabusRequest {
    private String OPEN_YR;
    // 학기
    private String SHTM;

    // 대상 학년
    private int TRGT_SHYR;

    // 조직 분류
    private String ORGN_CLSF_CD;

    // 단대
    private String COLG;

    // 학과
    private String DEGR_NM_SUST;

    // 과목 명
    private String OPEN_SBJT_NM;

    // 과목 분반
    private String OPEN_DCLSS;

    // 이수 구분
    private String CPTN_DIV_NM;

    // 학점
    private int PNT;

    // 이론 시수
    private int THEO_TMCNT;

    // 실습 시수
    private int PRAC_TMCNT;

    // 수업 개요
    private String LSN_SMRY;

    // 교과 목표
    private String SBJT_SHT;

    // 교재
    private String TEMT_REF_LITRT;

    // 참고 문헌
    private String REF_BOOK;

    // 선수 학습 내용
    private String PRE_LRN_CN;

    public Syllabus toEntity() {
        return Syllabus.builder()
        .SHTM(SHTM)
        .TRGT_SHYR(TRGT_SHYR)
        .ORGN_CLSF_CD(ORGN_CLSF_CD)
        .COLG(COLG)
        .DEGR_NM_SUST(DEGR_NM_SUST)
        .OPEN_DCLSS(OPEN_DCLSS)
        .CPTN_DIV_NM(CPTN_DIV_NM)
        .PNT(PNT)
        .THEO_TMCNT(THEO_TMCNT)
        .PRAC_TMCNT(PRAC_TMCNT)
        .LSN_SMRY(LSN_SMRY)
        .SBJT_SHT(SBJT_SHT)
        .TEMT_REF_LITRT(TEMT_REF_LITRT)
        .REF_BOOK(REF_BOOK)
        .PRE_LRN_CN(PRE_LRN_CN)
        .build();
    }
}
