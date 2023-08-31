package com.appsdeveloperblog.estore.core.events;

import lombok.Data;

@Data
public class PaymentProcessedEvent {
    private String orderId;
    private String paymentId;
}
