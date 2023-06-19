package com.bilgeli.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
    UUID id;
    private String scuCode;
    private BigDecimal price;
    private Integer quantity;
}
