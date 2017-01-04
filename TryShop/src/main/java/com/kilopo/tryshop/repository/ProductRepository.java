package com.kilopo.tryshop.repository;

import com.kilopo.tryshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

