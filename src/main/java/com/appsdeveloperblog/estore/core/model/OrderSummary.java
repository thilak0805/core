package com.appsdeveloperblog.estore.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderSummary {
    private String orderId;
    private OrderStatus orderStatus;
    private String reason;
}


