package one.dibsy.dibsyinterview.domain.refund;

import lombok.RequiredArgsConstructor;
import one.dibsy.dibsyinterview.domain.payment.PaymentRepository;
import one.dibsy.dibsyinterview.domain.refund.dto.RefundRequest;
import one.dibsy.dibsyinterview.domain.refund.dto.RefundResponseDto;
import org.springframework.stereotype.Service;

@Service
//@Transactional
@RequiredArgsConstructor
public class RefundService {

    private final PaymentRepository paymentRepository;
    private final RefundGateway refundGateway;

    public RefundResponseDto refundPayment(String paymentId, RefundRequest request) {
        // TODO: Implement
        // 1. Find payment by ID (throw exception if not found)
        // 2. Validate status is SUCCESS (throw exception if not)
        // 3. Call refund gateway
        // 4. Update payment status to REFUNDED
        // 5. Return response DTO
    }
}