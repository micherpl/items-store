package com.micher.estorage.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductsController {

//    allow to access env properties of spring
    @Autowired
    private Environment env;

//    local indicate real port number
    @GetMapping
    private String getProducts(){
        return "Get products" + env.getProperty("local.server.port");
    }

    @PostMapping
    private String postProducts(){
        return "Post products";
    }

    @PutMapping
    private void putProducts(){

    }

    @DeleteMapping
    private void deleteProducts(){

    }
}
