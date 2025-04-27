package com.dorotech.api_products.services;

import com.dorotech.api_products.models.ProductModel;
import com.dorotech.api_products.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void create(ProductModel product){
        productRepository.save(product);
    }

    public Optional<ProductModel> findById(UUID uuid){
        return productRepository.findById(uuid);
    }

    public ProductModel getById(UUID uuid){
        return productRepository.getById(uuid);
    }

    public void delete(ProductModel productModel){
        productRepository.delete(productModel);
    }

    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }
}
