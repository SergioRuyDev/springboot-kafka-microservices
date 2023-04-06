package com.sergioruy.basedomains.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
        description = "OrderEvent Model Information"
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {

    @Schema(
            description = "OrderEvent Message"
    )
    private String message;

    @Schema(
            description = "OrderEvent Status"
    )
    private String status;

    @Schema(
            description = "Order Model Information"
    )
    private Order order;
}
