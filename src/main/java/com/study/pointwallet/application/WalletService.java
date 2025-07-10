package com.study.pointwallet.application;

import com.study.pointwallet.domain.wallet.Wallet;
import com.study.pointwallet.domain.wallet.WalletRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletService {

    private final WalletRepository walletRepository;

    @Transactional
    public CreateWalletResult createWallet(CreateWalletCommand command) {
        // command -> domain
        Wallet domain = command.toDomain();
        // repository
        Wallet savedWallet = walletRepository.save(domain);
        // domain -> result
        return new CreateWalletResult().fromDomain(savedWallet);
    }

}
