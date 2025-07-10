package com.study.pointwallet.application;

import com.study.pointwallet.domain.wallet.Charge;
import com.study.pointwallet.domain.wallet.Wallet;
import com.study.pointwallet.domain.wallet.WalletRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletService {

    private final WalletRepository walletRepository;

    @Transactional
    public CreateWalletResult createWallet(CreateWalletCommand command) {
        // command -> domain
        Wallet domain = command.toDomain();
        // repository
        Wallet savedWallet = walletRepository.save(domain);
        // domain -> result
        return new CreateWalletResult().fromDomain(savedWallet);
    }

    public FindWalletResult findWalletByUserId(Long userId) {
        // repository
        Wallet wallet = walletRepository.findByUserId(userId);
        // domain -> result
        return new FindWalletResult().fromDomain(wallet);
    }

    public void chargeWallet(Long walletId, ChargeWalletCommand command) {
        // 📌 Q1
        // 여기 서비스에서는 위 메소드처럼
        // command -> domain, repository, domain -> result
        // 이런 형태로 안되는게 맞는지?
        
        // command -> domain
        Wallet wallet = walletRepository.findByWalletId(walletId);
        wallet.charge(command);

        // 변경 감지
        Wallet savedWallet = walletRepository.save(wallet);

        // 📌 Q2
        // 여기서부터
        // Charge 도메인에서 of()는 뭔지?
        // result를 어떤식으로 생성해야되는지랑
        // 리턴값을 컨트롤러에서 받아서 어떻게 처리해야하는지?
        Charge charge = Charge.of(savedWallet, command.getAmount(), command.getReason()); // <- Charge 타고 들어가보삼 질문있음용가리

        // domain -> result

        // 임시 return
        return;

        // 📌 Q5
        // 지갑 충전을 할때 history도 동시에 같이 쌓여야 하는데
        // 이건 그냥 통테에서만 하면 되는건지?
        // 아니면 컨트롤러에서 히스토리 내역 쌓는 서비스를 추가로 호출해야하는지?
        // 아니면 로그 쌓을때 전역으로 잡아서 쓰는것처럼 엮어도 되는지?
    }





}
