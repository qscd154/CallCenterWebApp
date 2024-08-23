package com.kst.csr.model;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "DEPT_COD")
@Getter
@Setter
@NoArgsConstructor
public class Department {

    @EmbeddedId
    private DepartmentId id;

    //사용자ID(외래 키로 연결)
    @ManyToOne
    @JoinColumn(name = "USRID")
    private User user;

    //부서영문명
    @Column(name = "deptengnm")
    private String deptEngNm;

    //부서한글명
    @Column(name = "kornm")
    private String korNm;

    //부서명약어
    @Column(name = "deptabbrnm")
    private String deptAbbrNm;

    //대분류상위부서
    @Column(name = "deptlagcd")
    private String deptLagCd;


    @Column(name = "upperdeptcd")
    private String upperDepartment;


    //부서전화번호
    @Column(name = "depttelno")
    private String deptTelNo;


    //화면정렬순서
    @Column(name = "dspseq")
    private Integer dspSeq;


    //사용여부
    @Column(name = "useflg")
    private Integer useFlg;

    //작성일자
    @Column(name = "wrtdt")
    private LocalDateTime wrtdt;


    //작성자ID
    @Column(name = "wrtid")
    private String wrtId;

    @Embeddable
    @Data
    private static class DepartmentId implements Serializable {
        @Column(name = "deptcd")
        private String deptCd;

        @Column(name = "trdcd")
        private String trdcd;
    }


}
