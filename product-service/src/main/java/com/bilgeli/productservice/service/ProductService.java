package com.bilgeli.productservice.service;

import com.bilgeli.productservice.dto.ProductRequestDTO;
import com.bilgeli.productservice.dto.ProductResponseDTO;
import com.bilgeli.productservice.model.Product;
import com.bilgeli.productservice.repository.ProductRepository;
import com.bilgeli.productservice.service.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public void createProduct(ProductRequestDTO productRequest) {
        Product product = productMapper.fromDTO(productRequest);
        productRepository.save(product);

        log.info("Product {} is saved", product.getId());
    }

    public List<ProductResponseDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(productMapper::toDTO)
                .collect(Collectors.toList());
    }
}
