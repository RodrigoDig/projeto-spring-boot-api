package com.digolucas.demo_h2.repository;

import com.digolucas.demo_h2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
