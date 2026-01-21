package one.dibsy.dibsyinterview.domain.payment;

import java.util.Optional;

public interface PaymentRepository {
    Optional<Payment> findById(String paymentId);
}
