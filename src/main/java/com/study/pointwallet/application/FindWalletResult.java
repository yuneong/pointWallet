package com.study.pointwallet.application;

import com.study.pointwallet.domain.wallet.Wallet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindWalletResult {

    private Long walletId;
    private Long userId;
    private Long balance;

    public FindWalletResult fromDomain(Wallet wallet) {
        return new FindWalletResult(
                wallet.getId(),
                wallet.getUserId(),
                wallet.getAmount()
        );
    }
}
