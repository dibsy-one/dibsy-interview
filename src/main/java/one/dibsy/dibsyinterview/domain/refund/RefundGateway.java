package one.dibsy.dibsyinterview.domain.refund;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class RefundGateway {

    /**
     * Simulates refund processing
     * Always succeeds for this test
     */
    public RefundResponse processRefund(String authCode, BigDecimal amount) {
        return new RefundResponse(
                true,
                "REF-" + UUID.randomUUID().toString().substring(0, 8)
        );
    }
}
