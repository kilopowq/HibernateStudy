package com.kilopo.tryshop.service;

import com.kilopo.tryshop.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();
    Product getById(long id);
    Product save(Product product);
    void delete(long id);
}
