package com.kst.csr.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "task_inf")
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    //요청사항 ID
    @Id
    @Column(name = "taskid")
    private Long taskId;

    //프로젝트NO
    @ManyToOne
    @JoinColumn(name = "prjtno")
    private Project prjtNo;

    //접수일자
    @Column(name = "regdt")
    private String regDt;

    //등록일자
    @Column(name = "schstdt")
    private String schStDt;

    //등록시간
    @Column(name = "schsttm")
    private String schEsTtm;


    //담당자
    @Column(name = "usrid")
    private String usrId;

    //종료일자
    @Column(name = "scheddt")
    private String schEdDt;

    //종료시간
    @Column(name = "schedtm")
    private String schEdTm;

    //상태
    @Column(name = "state")
    private String state;

    //공개등급
    @Column(name = "level")
    private String level;

    //작성자
    @Column(name = "wrtusrid")
    private String wrtusrid;

    //작성일자
    @Column(name = "wrtdt")
    private LocalDateTime wrtDt;


    //내용
    @Column(name = "reqinfo")
    private String reqInfo;

    //요청구분
    @Column(name = "receiptflg")
    private String receiptFlg;

    //요청자
    @Column(name = "reqnm")
    private String reqNm;

    //이메일
    @Column(name = "email")
    private String email;

    //제목
    @Column(name = "head")
    private String Head;
}
