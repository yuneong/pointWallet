package com.study.pointwallet.application;

import com.study.pointwallet.domain.wallet.Wallet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateWalletResult {

    private Long walletId;
    private Long userId;
    private Long balance;
    private LocalDate createdAt;

    public CreateWalletResult fromDomain(Wallet wallet) {
//        this.walletId = wallet.getId();
//        this.userId = wallet.getUserId();
//        this.balance = wallet.getAmount();
//        this.createdAt = wallet.getUpdatedAt();
//        return this;
        return new CreateWalletResult(
                wallet.getId(),
                wallet.getUserId(),
                wallet.getAmount(),
                wallet.getUpdatedAt()
        );
    }
}
