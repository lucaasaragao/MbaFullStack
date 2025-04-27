package com.dorotech.api_products.controllers;

import com.dorotech.api_products.dtos.ProductDto;
import com.dorotech.api_products.models.ProductModel;
import com.dorotech.api_products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/produtcs")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/create")
    public ResponseEntity<ProductModel> create(@RequestBody ProductDto dto){
        ProductModel createNewProduct = new ProductModel();
        createNewProduct.setId(UUID.randomUUID());
        createNewProduct.setName(dto.getName());
        createNewProduct.setDescription(dto.getDescription());
        createNewProduct.setPrice(dto.getPrice());
        createNewProduct.setAmount(dto.getAmount());

        service.create(createNewProduct);

        return ResponseEntity.status(HttpStatus.CREATED).body(createNewProduct);
    }

    @GetMapping()
    public Optional<ProductModel> getProductById (
            @RequestParam UUID id){
        var product = service.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(product).getBody();
    }

    @GetMapping("/list")
    public List<ProductModel> getAll(){
        List<ProductModel> products = (List<ProductModel>) service.getAllProducts();
        return ResponseEntity.ok(products).getBody();
    }

    @DeleteMapping()
    public ResponseEntity<ProductModel> deleteProductById(
            @RequestParam UUID id){
        var product = service.getById(id);
        service.delete(product);
        return ResponseEntity.noContent().build();
    }
}
