package com.study.pointwallet.presentation;

import com.study.pointwallet.application.FindWalletResult;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindWalletResponse {

    private Long walletId;
    private Long userId;
    private Long balance;

    public FindWalletResponse fromResult(FindWalletResult result) {
        return new FindWalletResponse(
                result.getWalletId(),
                result.getUserId(),
                result.getBalance()
        );
    }

}
