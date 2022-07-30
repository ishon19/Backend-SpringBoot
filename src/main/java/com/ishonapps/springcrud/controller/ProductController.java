package com.ishonapps.springcrud.controller;

import com.ishonapps.springcrud.entity.Product;
import com.ishonapps.springcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @GetMapping("/getAllProducts")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductProductById(id);
    }

    @GetMapping("/getProductByName/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProductById(id);
    }

    @DeleteMapping("/deleteAllProducts")
    void deleteAll() {
        service.deleteAll();
    }
}

