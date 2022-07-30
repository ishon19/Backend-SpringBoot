package com.ishonapps.springcrud.service;

import com.ishonapps.springcrud.entity.Product;
import com.ishonapps.springcrud.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public Product saveProduct(Product product) {
        return repo.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repo.saveAll(products);
    }

    public Product getProductProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repo.findByName(name);
    }

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public String deleteProductById(int id) {
        repo.deleteById(id);
        return "Deleted " + id;
    }

    public void deleteAll() {
        repo.deleteAll();
    }

    public Product updateProduct(Product product) {
        // find the product and then update
        Product prod = repo.findById(product.getId()).orElse(null);
        if (prod != null) {
            prod.setName(product.getName());
            prod.setPrice(product.getPrice());
            prod.setQuantity(product.getQuantity());
        }

        return repo.save(prod);
    }
}
