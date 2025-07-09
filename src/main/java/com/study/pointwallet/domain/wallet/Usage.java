package com.study.pointwallet.domain.wallet;

import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "point_usage")
public class Usage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usage_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wallet_id",  nullable = false)
    private Wallet wallet;

    @Comment("사용 구분 타입")
    private String usageType;

    @Comment("사용 참조 대상 ID")
    private Long targetId;

    @Comment("사용 금액")
    private Long amount;

}
