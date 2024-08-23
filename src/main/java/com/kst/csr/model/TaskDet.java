package com.kst.csr.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "taskdet_inf_renew")
@NoArgsConstructor
@AllArgsConstructor
public class TaskDet {

    //작업 ID
    @Id
    @ManyToOne
    @JoinColumn(name = "taskid")
    private Task task;

    //상세 테스크 ID
    @Id
    @Column(name = "taskdetid")
    private Integer taskdetid;

    //요청자명
    @Column(name = "REQNM", length = 30)
    private String reqNm;

    //작업 시작일자
    @Column(name = "STARTDT", length = 8)
    private String startDt;

    //작업 시작시간
    @Column(name = "STARTTM", length = 6)
    private String startTm;

    //작업 종료일자
    @Column(name = "ENDDT", length = 8)
    private String endDt;

    //작업 종료시간
    @Column(name = "ENDTM", length = 6)
    private String endTm;

    //작업자 ID
    @Column(name = "USRID", length = 10)
    private String usrId;

    //버전
    @Column(name = "VERSION", length = 11)
    private String version;

    //소요시간
    @Column(name = "TURNATM")
    private Integer turnAtm;

    //작업방법
    @Column(name = "METHOD", length = 8)
    private String method;

    //상태
    @Column(name = "STATE", length = 8)
    private String state;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "ATTACHSEQ", referencedColumnName = "attachseq"),
            @JoinColumn(name = "SEQ", referencedColumnName = "seq")
    })
    private Fileinfo attachFile;

    // 작성 일자
    @Column(name = "WRTDT")
    private LocalDateTime wrtDt;

    //작업 결과
    @Column(name = "RESULTINFO", length = 4000)
    private String resultInfo;

    //완료 플래그
    @Column(name = "COMPFLG")
    private Integer compFlg;

    //제목
    @Column(name = "HEAD", length = 500)
    private String head;

    //작성자 ID
    @Column(name = "WRTUSRID", length = 10)
    private String wrtUsrId;


}
