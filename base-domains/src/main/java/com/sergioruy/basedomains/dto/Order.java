package com.sergioruy.basedomains.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
        description = "Order Model Information"
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Schema(
            description = "Order Register Number"
    )
    private String orderId;

    @Schema(
            description = "Order Name"
    )
    private String orderName;

    @Schema(
            description = "Quantity of product"
    )
    private int qty;

    @Schema(
            description = "Total Price of the Order"
    )
    private double price;
}
