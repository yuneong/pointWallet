package com.study.pointwallet.domain.wallet;

import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Entity
@Table(name = "point_history")
public class History {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wallet_id",  nullable = false)
    private Wallet wallet;

    @Comment("이력 구분 타입")
    private String historyType;

    @Comment("변동 금액")
    private Long amount;

    @Comment("변동 후 잔액")
    private Long relatedAfter;

    @Comment("기록 날짜")
    private LocalDate createdAt;

}
