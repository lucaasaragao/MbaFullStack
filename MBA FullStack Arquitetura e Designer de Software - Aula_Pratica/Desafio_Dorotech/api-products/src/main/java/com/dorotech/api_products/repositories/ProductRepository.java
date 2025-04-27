package com.dorotech.api_products.repositories;


import com.dorotech.api_products.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

    @Override
    Optional<ProductModel> findById(UUID uuid);
    ProductModel getById(UUID uuid);
}
