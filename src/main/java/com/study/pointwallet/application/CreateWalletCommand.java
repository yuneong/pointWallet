package com.study.pointwallet.application;

import com.study.pointwallet.domain.wallet.Wallet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateWalletCommand {

    private Long userId;

    public Wallet toDomain() {
        return Wallet.createWallet(userId);
    }
}
