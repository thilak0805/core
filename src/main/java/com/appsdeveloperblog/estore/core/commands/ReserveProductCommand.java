package com.appsdeveloperblog.estore.core.commands;

import lombok.Builder;
import lombok.Data;
import lombok.Lombok;

@Data
@Builder
public class ReserveProductCommand {
    private final String productId;
    private final int quantity;
    private final String orderId;
    private final String userId;

}
