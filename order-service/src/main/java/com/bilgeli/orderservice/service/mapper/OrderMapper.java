package com.bilgeli.orderservice.service.mapper;

import com.bilgeli.orderservice.dto.OrderRequest;
import com.bilgeli.orderservice.model.Order;
import com.bilgeli.orderservice.model.OrderLineItems;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class OrderMapper {
    private final OrderLineItemsMapper orderLineItemsMapper;

    public Order toDto(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(orderLineItemsMapper::toDto)
                .collect(Collectors.toList());

        order.setOrderLineItemsList(orderLineItems);

        return order;
    }
}
