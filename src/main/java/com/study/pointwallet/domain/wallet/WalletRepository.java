package com.study.pointwallet.domain.wallet;

public interface WalletRepository {

    Wallet save(Wallet wallet);

    Wallet findByUserId(Long userId);

    Wallet findByWalletId(Long walletId);

}
