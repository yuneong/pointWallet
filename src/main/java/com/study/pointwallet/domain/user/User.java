package com.study.pointwallet.domain.user;

import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Comment("사용자 이름")
    private String name;

    @Comment("사용자 이메일")
    private String email;

    @Comment("생성 날짜")
    private LocalDate createdAt;

}
