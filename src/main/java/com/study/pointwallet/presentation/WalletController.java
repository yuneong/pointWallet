package com.study.pointwallet.presentation;

import com.study.pointwallet.application.WalletService;
import com.study.pointwallet.domain.Wallet;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wallet")
@RequiredArgsConstructor
public class WalletController {

    private final WalletService walletService;

    /**
     * 사용자 포인트 지갑 생성
     * @param wallet
     * @return
     */
    @PostMapping("/")
    public Wallet createWallet(@RequestBody Wallet wallet) {
        return null;
    }

    /**
     * 사용자 포인트 지갑 조회
     * @param walletId
     * @return
     */
    @GetMapping("/{walletId}")
    public Wallet getWallet(@PathVariable Long walletId) {
        return null;
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
