package com.study.pointwallet.domain.wallet;

import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Entity
@Table(name = "point_charge")
public class Charge {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "charge_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wallet_id", nullable = false)
    private Wallet wallet;

    @Comment("충전 금액")
    private Long amount;

    @Comment("충전 사유")
    private String reason;

    @Comment("만료 날짜")
    private LocalDate expiredAt;

}
