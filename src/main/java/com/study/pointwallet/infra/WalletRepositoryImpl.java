package com.study.pointwallet.infra;

import com.study.pointwallet.domain.wallet.Wallet;
import com.study.pointwallet.domain.wallet.WalletRepository;
import jakarta.persistence.EntityNotFoundException;
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

    @Override
    public Wallet findByUserId(Long userId) {
        return jpaWalletRepository.findByUserId(userId)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
    }

}
