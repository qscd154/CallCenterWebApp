package com.kst.csr.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project_mst")
public class Project {

    @Id
    @Column(name = "prjtno")
    private Long projectId;

    @Column(name = "prjtnm")
    private String projectName;

    @Column(name = "startdt")
    private String startDate;

    @Column(name = "enddt")
    private String endDate;

    @ManyToOne
    @JoinColumn(name = "trdcd")
    private Customer traderCode;

    @Column(name = "prjtstate")
    private Integer projectState;

    @Column(name = "procstate")
    private Integer processState;


    @Column(name = "wrtusrid")
    private String createdBy;

    @Column(name = "wrtdt")
    private LocalDateTime creationDate;

    @Column(name = "prjmemo")
    private String projectMemo;
}
