package com.kilopo.tryshop.service.interfaces;

import com.kilopo.tryshop.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(long id);
    Product addProduct(Product product);
    void deleteProduct(long id);

}
