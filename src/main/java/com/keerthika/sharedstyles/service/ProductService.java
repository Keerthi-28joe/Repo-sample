package com.keerthika.sharedstyles.service;

import com.keerthika.sharedstyles.model.Product;
import com.keerthika.sharedstyles.repository.ProductRepository;
import jakarta.persistence.Table;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {

    private final ProductRepository productRepository;

    // Constructor injection for ProductRepository
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Add a new product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get product by ID
    public Product getProductById(int id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
    }

    // Delete product
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
