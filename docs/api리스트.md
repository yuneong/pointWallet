## 📡 API 리스트

### 1. `사용자 포인트 지갑 생성`
- POST
- /api/wallet
- return
  - walletId: 새로 생성된 지갑의 고유 ID
  - userId: 지갑 소유 유저의 ID
  - balance: 초기 포인트 잔액 (일반적으로 0)
  - createdAt: 지갑 생성 시각

### 2. `사용자 포인트 지갑 조회`
- GET
- /api/wallet/{walletId}
- return
    - walletId: 새로 생성된 지갑의 고유 ID
    - userId: 지갑 소유 유저의 ID
    - balance: 초기 포인트 잔액 (일반적으로 0)
    - createdAt: 지갑 생성 시각

### 3. `사용자 포인트 충전`
- POST
- /api/wallet/{walletId}/charge
- return 
  - walletId: 충전된 지갑 ID
  - chargedAmount: 이번에 충전한 포인트
  - balance: 충전 후 잔액
  - chargedAt: 충전 시각

### 4. `사용자 포인트 사용`
- POST
- /api/wallet/{walletId}/usage
- return 
  - walletId: 사용된 지갑 ID
  - usedAmount: 차감한 포인트
  - balance: 사용 후 잔액
  - usedAt: 포인트 사용 시각

### 5. `포인트 내역 조회`
- GET
- /api/wallet/{walletId}/history
- return 
  - walletId: 내역을 가진 지갑 ID
  - histories: 포인트 내역 리스트 (충전/사용/적립/차감 등)
    - type: CHARGE, USAGE 등
    - amount: 거래 금액
    - balanceAfter: 해당 거래 이후의 잔액
    - createdAt: 거래 시각

### 6. `지갑 잔액 조회`
- GET
- /api/wallet/{walletId}/balance
- return 
  - walletId: 잔액을 조회한 지갑 ID
  - balance: 현재 잔액
