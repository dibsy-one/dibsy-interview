package one.dibsy.dibsyinterview.domain.payment;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class Payment {
    private String id;

    private String orderId;
    private BigDecimal amount;
    private String currency;

    private PaymentStatus status; // SUCCESS, FAILED, REFUNDED

    private String authorizationCode;
    private LocalDateTime createdAt;
}
