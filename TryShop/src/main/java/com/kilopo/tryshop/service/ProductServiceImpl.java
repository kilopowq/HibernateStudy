package com.kilopo.tryshop.service;

import com.kilopo.tryshop.entity.Product;
import com.kilopo.tryshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getById(long id) {
        return productRepository.findOne(id);
    }

    public Product save(Product product) {
        return productRepository.saveAndFlush(product);
    }

    public void delete(long id) {
        productRepository.delete(id);
    }
}
