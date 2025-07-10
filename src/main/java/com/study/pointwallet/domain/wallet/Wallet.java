package com.study.pointwallet.domain.wallet;

import com.study.pointwallet.application.ChargeWalletCommand;
import com.study.pointwallet.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Entity
@Table(name = "point_wallet")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Wallet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wallet_id")
    private Long id;

//    @OneToOne(optional = false, fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;

    @Column(nullable = false)
    private Long userId;

    @Comment("총 잔액")
    private Long amount;

    @Comment("마지막 업데이트 날짜")
    private LocalDate updatedAt;

    public static Wallet createWallet(Long userId) {
        return Wallet.builder()
                .userId(userId)
                .amount(0L)
                .updatedAt(LocalDate.now())
                .build();
    };

    public Wallet charge(ChargeWalletCommand command) {
        this.amount += command.getAmount();
        this.updatedAt = LocalDate.now();
        return this;
    }











}
