package com.bilgeli.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse<T> {
    public static final String SUCCESS_CODE = "100";
    public static final String FAILED_CODE = "TE-101";

    public String code;
    public String message;
    T Data;

    public static <T> OrderResponse<T> success(T data) {
        return OrderResponse.<T>builder()
                .Data(data)
                .code(SUCCESS_CODE)
                .build();
    }

    public static OrderResponse success() {
        return OrderResponse.builder()
                .code(SUCCESS_CODE)
                .build();
    }

    public static OrderResponse failed(Throwable ex) {
        return OrderResponse.builder()
                .code(FAILED_CODE)
                .message(ex.getMessage())
                .build();
    }
}
