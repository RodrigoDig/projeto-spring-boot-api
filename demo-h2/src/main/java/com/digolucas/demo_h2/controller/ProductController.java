package com.digolucas.demo_h2.controller;

import com.digolucas.demo_h2.model.Product;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.digolucas.demo_h2.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    private final ProductRepository productRepository;
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping
    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }

    @PostMapping
    public Product createProduct(@Valid @RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping
    public Product updateProduct(@Valid @RequestBody Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }

}
