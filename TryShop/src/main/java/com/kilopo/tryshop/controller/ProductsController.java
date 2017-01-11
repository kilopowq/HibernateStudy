package com.kilopo.tryshop.controller;

import com.kilopo.tryshop.entity.Basket;
import com.kilopo.tryshop.entity.Product;
import com.kilopo.tryshop.entity.User;
import com.kilopo.tryshop.service.interfaces.CategoryService;
import com.kilopo.tryshop.service.interfaces.ProducerService;
import com.kilopo.tryshop.service.interfaces.ProductService;
import com.kilopo.tryshop.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
public class ProductsController {

    @Autowired
    private ProductService service;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getAllProducts() {

        return service.getAllProducts();
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Product getProduct(@PathVariable("id") long productId) {
        return service.getProductById(productId);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    @ResponseBody
    public Product saveProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteProduct(@PathVariable("id") long productId) {
        service.deleteProduct(productId);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String deleteProductіііі() {

        User user = new User();
        user.setName("kilopo1");
        user.setSurname("kilopo");
        user.setEmail("kilopo");
        user.setAddress("kilopo");
        user.setPhone("kilopo");
        user.setRegister_date(new Date(1994, 9, 12));
        user.setLogin("kilopo");
        user.setPassword("kilopo");
        user.setBaskets(new Basket());

        userService.register(user);
        return "" + userService.getUserById(1).getBaskets().getId();
    }

}
