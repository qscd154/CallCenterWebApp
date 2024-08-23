package com.kst.csr.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_mst")
public class User {

    @Id
    @Column(name = "userid")
    private String userId;

    @Column(name = "usrkornm")
    private String userKoreanName;


    @Column(name = "DEPTCD")
    private String department;

    @Column(name = "passwd")
    private String password;

    @Column(name = "pwdencryptflg")
    private Integer passwordEncryptionFlag;

    @Column(name = "emailid")
    private String email;

    @Column(name = "wrtDt")
    private LocalDateTime recordDate;

    @Column(name = "wrtid")
    private String recorderId;


    @Column(name = "TRDCD")
    private Integer customer;


}
