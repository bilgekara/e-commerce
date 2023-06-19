package com.bilgeli.orderservice.resource;

import com.bilgeli.orderservice.dto.OrderRequest;
import com.bilgeli.orderservice.dto.OrderResponse;
import com.bilgeli.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderResource {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResponse placeHolder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);

        return OrderResponse.success();
    }
}
