package com.bilgeli.productservice.repository;

import com.bilgeli.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends MongoRepository<Product, UUID> {
    @Override
    List<Product> findAll();

}
