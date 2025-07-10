package com.study.pointwallet.domain.wallet;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Entity
@Table(name = "point_charge")
@NoArgsConstructor
@AllArgsConstructor
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

    // 📌 Q3
    // Wallet 객체 자체를 받을 때
    // walletId 로 받을 때
    // 아래에 존재하는 of()의 쓰임이 어떻게 달라지는지?

    // 📌 Q4
    // 만료 날짜 expiredAt을 저장하는데
    // 이 값은 저장하면서 임시로 정해줘도 되는건지?

    public Charge(Wallet wallet, Long amount, String reason, LocalDate expiredAt) {
        this.wallet = wallet;
        this.amount = amount;
        this.reason = reason;
        this.expiredAt = expiredAt;
    }

    public static Charge of(Wallet wallet, Long amount, String reason) {
        return new Charge(wallet, amount, reason, LocalDate.now());
    }

}
