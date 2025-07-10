package com.study.pointwallet.presentation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChargeWalletResponse {

    private Long walletId;
    private Long chargedAmount;
    private Long balance;
    private LocalDate chargedAt;

}
