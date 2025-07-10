package com.study.pointwallet.presentation;

import com.study.pointwallet.application.CreateWalletCommand;
import com.study.pointwallet.application.CreateWalletResult;
import com.study.pointwallet.application.FindWalletResult;
import com.study.pointwallet.application.WalletService;
import com.study.pointwallet.domain.wallet.Wallet;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wallet")
@RequiredArgsConstructor
public class WalletController {

    private final WalletService walletService;

    /**
     * 사용자 포인트 지갑 생성
     * @param request
     * @return
     */
    @PostMapping("/")
    public CreateWalletResponse createWallet(@RequestBody CreateWalletRequest request) {
        // request -> command
        CreateWalletCommand command = request.toCommand();
        // service
        CreateWalletResult result = walletService.createWallet(command);
        // result -> response
        return new CreateWalletResponse().fromResult(result);
    }

    /**
     * 사용자 포인트 지갑 조회
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public FindWalletResponse findWalletByUserId(@PathVariable Long userId) {
        // service
        FindWalletResult result = walletService.findWalletByUserId(userId);
        // result -> response
        return new FindWalletResponse().fromResult(result);
    }

    /**
     * 사용자 포인트 충전
     * @param walletId
     * @param wallet
     * @return
     */
    @PostMapping("/{walletId}/charge")
    public Wallet charge(@PathVariable Long walletId, @RequestBody Wallet wallet) {
        return null;
    }

    /**
     * 사용자 포인트 사용
     * @param walletId
     * @param wallet
     * @return
     */
    @PostMapping("/{walletId}/usage")
    public Wallet usage(@PathVariable Long walletId, @RequestBody Wallet wallet) {
        return null;
    }

    /**
     * 포인트 내역 조회
     * @param walletId
     * @param wallet
     * @return
     */
    @PostMapping("/{walletId}/history")
    public Wallet history(@PathVariable Long walletId, @RequestBody Wallet wallet) {
        return null;
    }

    /**
     * 지갑 잔액 조회
     * @param walletId
     * @return
     */
    @GetMapping("/{walletId}/balance")
    public Wallet getBalance(@PathVariable Long walletId) {
        return null;
    }

}
