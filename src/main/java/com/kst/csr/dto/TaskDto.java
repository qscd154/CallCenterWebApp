package com.kst.csr.dto;

import com.kst.csr.model.Project;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDto {
    //요청사항 ID
    private Long taskId;
    //접수일자
    private String regDt;
    //제목
    private String head;
    //상태
    private String state;
    //요청자
    private String reqNm;

}
