package one.dibsy.dibsyinterview.domain.refund;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RefundResponse {
    private boolean success;
    private String refundId;
}