package com.kst.csr.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "custom_mst")
public class Customer {
    @Id
    @Column(name = "trdcd")
    private Long customerCode;

    @Column(name = "cmpyregno")
    private String registrationNumber;

    @Column(name = "cmpynm")
    private String companyName;

    @Column(name = "prsntnm")
    private String representativeName;

    @Column(name = "trdstate")
    private Integer customerType;

    @Column(name = "cmpytel")
    private String phone;

    @Column(name = "cmpyfax")
    private String fax;

    @Column(name = "wrtid")
    private String creatorId;

    @Column(name = "wrtdt")
    private LocalDateTime registrationDate;

    @Column(name = "trditems")
    private String mainTradeItems;
}
