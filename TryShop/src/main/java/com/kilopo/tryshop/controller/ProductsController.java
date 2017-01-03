package com.kilopo.tryshop.controller;

import com.kilopo.tryshop.entity.Product;
import com.kilopo.tryshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductsController {

    @Autowired
    private ProductService service;

    @RequestMapping(value="/products", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getAllProducts(){
        return service.getAll();
    }

    @RequestMapping(value="/products/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Product getProduct(@PathVariable("id") long productId){
        return service.getById(productId);
    }

    @RequestMapping(value="/products", method = RequestMethod.POST)
    @ResponseBody
    public Product saveProduct(@RequestBody Product product){
        return service.save(product);
    }

    @RequestMapping(value="/products/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteProduct(@PathVariable("id") long productId){
        service.delete(productId);
    }
}
