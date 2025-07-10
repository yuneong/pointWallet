package com.study.pointwallet.application;

import com.study.pointwallet.domain.wallet.Wallet;
import com.study.pointwallet.domain.wallet.WalletRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class WalletServiceTest {

    @InjectMocks
    private WalletService walletService;

    @Mock
    private WalletRepository walletRepository;

    @Test
    @DisplayName("지갑 생성")
    public void createWallet() {
        // given
        Long userId = 1L;
        CreateWalletCommand command = new CreateWalletCommand(userId);
        Wallet wallet = command.toDomain();
        given(walletRepository.save(any())).willReturn(wallet);

        // when
        CreateWalletResult result = walletService.createWallet(command);

        // then
        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(command.getUserId()).isEqualTo(result.getUserId());
    }
}