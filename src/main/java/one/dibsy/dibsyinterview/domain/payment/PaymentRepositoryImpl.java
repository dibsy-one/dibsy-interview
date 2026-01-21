package one.dibsy.dibsyinterview.domain.payment;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PaymentRepositoryImpl implements PaymentRepository {

    // Mock payment data retrieval
    @Override
    public Optional<Payment> findById(String paymentId) {
        return Optional.empty();
    }
}