package com.bilgeli.orderservice.service;

import com.bilgeli.orderservice.dto.OrderRequest;
import com.bilgeli.orderservice.model.Order;
import com.bilgeli.orderservice.repository.OrderRepository;
import com.bilgeli.orderservice.service.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = orderMapper.toDto(orderRequest);

        orderRepository.save(order);
    }
}
