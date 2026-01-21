package one.dibsy.dibsyinterview.domain.payment;

import lombok.RequiredArgsConstructor;
import one.dibsy.dibsyinterview.domain.refund.RefundService;
import one.dibsy.dibsyinterview.domain.refund.dto.RefundRequest;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RefundService refundService;

    @PostMapping("/{paymentId}/refund")
    public ResponseEntity<?> refundPayment(
            @PathVariable String paymentId,
            @RequestBody RefundRequest request
    ) {
        // TODO: Implement
        // 1. Call service
        // 2. Return 200 with response
    }

    // TODO: Add exception handlers
    @ExceptionHandler(PaymentNotFoundException.class)
    public ResponseEntity<?> handleNotFound(PaymentNotFoundException ex) {
        // TODO: Return 404
    }

    @ExceptionHandler(InvalidPaymentStateException.class)
    public ResponseEntity<?> handleInvalidState(InvalidPaymentStateException ex) {
        // TODO: Return 400
    }
}
