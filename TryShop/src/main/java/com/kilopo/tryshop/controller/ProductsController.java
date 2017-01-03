package com.kilopo.tryshop.controller;

import com.kilopo.tryshop.entity.Product;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reminder")
public class ProductsController {

    @RequestMapping(value="/get", method = RequestMethod.GET)
    @ResponseBody
    public Product getReminder(){
        return createMockProduct();
    }

    private Product createMockProduct() {
        Product product = new Product();
        product.setId(1);
        product.setName("dffds");
        product.setInfo("dfdsfdsfsdfdsvrwefdsc fwsdc er ");
        product.setPrice(14.88);
        product.setPhoto("dfsdfdsfds");

        return product;
    }
}
