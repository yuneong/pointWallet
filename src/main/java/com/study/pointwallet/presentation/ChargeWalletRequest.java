package com.study.pointwallet.presentation;

import com.study.pointwallet.application.ChargeWalletCommand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChargeWalletRequest {

    private Long amount;
    private String reason;
    private LocalDate expiredAt;

    public ChargeWalletCommand toCommand() {
        return new ChargeWalletCommand(this.amount, this.reason, this.expiredAt);
    }

}
