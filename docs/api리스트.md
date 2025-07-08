## 📡 API 리스트

### 1. `사용자 포인트 지갑 생성`
- POST
- /api/v1/wallet

### 2. `사용자 포인트 지갑 조회`
- GET
- /api/v1/wallet/{walletId}

### 3. `사용자 포인트 충전`
- POST
- /api/v1/wallet/{walletId}/charge

### 4. `사용자 포인트 사용`
- POST
- /api/v1/wallet/{walletId}/usage

### 5. `포인트 내역 조회`
- GET
- /api/v1/wallet/{walletId}/history

### 6. `지갑 잔액 조회`
- GET
- /api/v1/wallet/{walletId}/balance
