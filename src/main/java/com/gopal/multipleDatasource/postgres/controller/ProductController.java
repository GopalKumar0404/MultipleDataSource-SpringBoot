package com.gopal.multipleDatasource.postgres.controller;

import com.gopal.multipleDatasource.postgres.entity.Product;
import com.gopal.multipleDatasource.postgres.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepo;

    @GetMapping("/product/id/{id}")
    public Product getProductById(@PathVariable(name = "id") Integer id){
        return productRepo.findById(id).orElse(new Product(0,"Random","Value"));
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }
    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product){
        return productRepo.save(product);
    }
}
