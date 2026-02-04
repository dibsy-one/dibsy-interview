# Payment Refund API - Live Coding Exercise

## Time Limit: 20 minutes

---

## Requirements

### 1. Create Custom Exceptions

Create the following exception classes:

- `PaymentNotFoundException`
- `InvalidPaymentStateException`

---

### 2. Implement Refund Endpoint

**Endpoint:** `POST /api/v1/payments/{paymentId}/refund`

**Request Body:**
```json
{
  "reason": "Customer requested refund"
}
```

---

### 3. Expected Responses

#### Success Response (HTTP 200)
```json
{
  "paymentId": "PAY-12345",
  "refundId": "REF-abc123",
  "amount": 99.99,
  "currency": "EUR",
  "status": "REFUNDED",
  "refundedAt": "2025-01-21T10:30:00Z"
}
```

#### Payment Not Found (HTTP 404)
```json
{
  "error": "Payment not found: PAY-99999",
  "timestamp": "2025-01-21T10:30:00Z"
}
```

#### Invalid Payment State (HTTP 400)
```json
{
  "error": "Payment cannot be refunded. Current status: FAILED",
  "timestamp": "2025-01-21T10:30:00Z"
}
```

---

## Business Rules

1. Only payments with status `SUCCESS` can be refunded
2. Payment status must be updated to `REFUNDED` after successful refund
3. Use the provided `RefundGateway` service to process refunds
4. All operations must be transactional

---

## Evaluation Criteria

- ✅ Custom exceptions created and used properly
- ✅ Endpoint implemented with correct HTTP methods and paths
- ✅ Request/Response DTOs match the specification
- ✅ Business validation (payment status check)
- ✅ Proper exception handling with correct HTTP status codes
- ✅ Transaction management
- ✅ Service layer implementation
- ✅ Code compiles and runs

**Minimum passing score: 7/10**

---

## Good Luck! 🚀
