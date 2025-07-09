package com.study.pointwallet.infra;

import com.study.pointwallet.domain.wallet.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaWalletRepository extends JpaRepository<Wallet, Long> {

}
