package com.kst.csr.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "file_inf")
public class Fileinfo {

    //첨부파일순번
    @EmbeddedId
    private FileinfoId id;


    //첨부파일구분
    @Column(name = "attachflg")
    private Integer attachFlg;


    //서버경로
    @Column(name = "svrpath", length = 100)
    private String svrPath;


    //파일명
    @Column(name = "filenm", length = 500)
    private String fileNm;


    //작성일자
    @Column(name = "wrtdt")
    private LocalDateTime wrtDt;

    @Embeddable
    @Data
    public static class FileinfoId implements Serializable {
        @Column(name = "attachseq")
        private Long attachSeq;

        @Column(name = "seq")
        private Integer seq;
    }


}
