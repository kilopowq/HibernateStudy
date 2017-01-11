package com.kilopo.tryshop.service;

import com.kilopo.tryshop.entity.Product;
import com.kilopo.tryshop.repository.ProductRepository;
import com.kilopo.tryshop.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(long id) {
        return productRepository.findOne(id);
    }

    public Product addProduct(Product product) {
        return productRepository.saveAndFlush(product);
    }

    public void deleteProduct(long id) {
        productRepository.delete(id);
    }
}
