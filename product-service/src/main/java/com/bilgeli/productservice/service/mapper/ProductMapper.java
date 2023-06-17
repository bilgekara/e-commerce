package com.bilgeli.productservice.service.mapper;

import com.bilgeli.productservice.dto.ProductRequestDTO;
import com.bilgeli.productservice.dto.ProductResponseDTO;
import com.bilgeli.productservice.model.Product;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ProductMapper {
    public Product fromDTO(ProductRequestDTO productRequest) {
        return Product.builder()
                .id(UUID.randomUUID())
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
    }

    public ProductResponseDTO toDTO(Product product) {
        return ProductResponseDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }


}
