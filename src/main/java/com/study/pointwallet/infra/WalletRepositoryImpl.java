package com.study.pointwallet.infra;

import com.study.pointwallet.domain.wallet.Wallet;
import com.study.pointwallet.domain.wallet.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class WalletRepositoryImpl implements WalletRepository {

    private final JpaWalletRepository jpaWalletRepository;

    @Override
    public Wallet save(Wallet wallet) {
        return jpaWalletRepository.save(wallet);
    }

}
