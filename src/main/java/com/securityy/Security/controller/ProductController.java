package com.securityy.Security.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    private record Product(Integer productId,
                           String productName,
                           double price){}


    List<Product> products = new ArrayList<>(
            List.of(
                    new Product(1,"Iphone",999.0),
                    new Product(2,"samsung",543.9)
            )
    );

    @GetMapping
    public List<Product>getProducts(){
        return  products;
    }


    @PostMapping
    public  Product saveproduct(@RequestBody Product product){
        products.add(product);
        return product;
    }

}
