package com.bilgeli.orderservice.service.mapper;

import com.bilgeli.orderservice.dto.OrderLineItemsDto;
import com.bilgeli.orderservice.model.OrderLineItems;
import org.springframework.stereotype.Component;

@Component
public class OrderLineItemsMapper {
    public OrderLineItems toDto(OrderLineItemsDto orderLineItemsDto){
        OrderLineItems orderLineItems = new OrderLineItems();

        orderLineItems.setScuCode(orderLineItemsDto.getScuCode());
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());

        return orderLineItems;
    }
}
