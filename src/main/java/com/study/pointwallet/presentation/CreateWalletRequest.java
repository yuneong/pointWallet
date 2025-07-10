package com.study.pointwallet.presentation;

import com.study.pointwallet.application.CreateWalletCommand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateWalletRequest {

    private Long userId;

    public CreateWalletCommand toCommand() {
        return new CreateWalletCommand(userId);
    }
}
