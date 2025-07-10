package com.study.pointwallet.presentation;

import com.study.pointwallet.application.CreateWalletResult;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateWalletResponse {

    private Long walletId;
    private Long userId;
    private Long balance;
    private LocalDate createdAt;

    public CreateWalletResponse fromResult(CreateWalletResult result) {
        return new CreateWalletResponse(
                result.getWalletId(),
                result.getUserId(),
                result.getBalance(),
                result.getCreatedAt()
        );
    }

}
