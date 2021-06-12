package com.micher.estorage.http;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {

    @GetMapping
    private String getProducts(){
        return "Get products";
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
