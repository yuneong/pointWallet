package com.study.pointwallet.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChargeWalletCommand {

    private Long amount;
    private String reason;
    private LocalDate expiredAt;

}
