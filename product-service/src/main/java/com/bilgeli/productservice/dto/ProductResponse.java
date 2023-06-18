package com.bilgeli.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse<T> {
    public static final String SUCCESS_CODE = "100";
    public static final String FAILED_CODE = "TE-101";

    public String code;
    public String message;
    T Data;

    public static <T> ProductResponse<T> success(T data) {
        return ProductResponse.<T>builder()
                .Data(data)
                .code(SUCCESS_CODE)
                .build();
    }

    public static ProductResponse success() {
        return ProductResponse.builder()
                .code(SUCCESS_CODE)
                .build();
    }

    public static ProductResponse failed(Throwable ex) {
        return ProductResponse.builder()
                .code(FAILED_CODE)
                .message(ex.getMessage())
                .build();
    }
}
