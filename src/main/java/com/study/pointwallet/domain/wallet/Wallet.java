package com.study.pointwallet.domain.wallet;

import com.study.pointwallet.domain.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Entity
@Table(name = "point_wallet")
public class Wallet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wallet_id")
    private Long id;

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Comment("총 잔액")
    private Long amount;

    @Comment("마지막 업데이트 날짜")
    private LocalDate updatedAt;

}
