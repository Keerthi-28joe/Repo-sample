package com.keerthika.sharedstyles.controller;

import com.keerthika.sharedstyles.model.Product;
import com.keerthika.sharedstyles.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    // Constructor injection for ProductService
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Add a New Product
    @PostMapping("/addprod")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product savedProduct = productService.addProduct(product);
        return ResponseEntity.ok(savedProduct);
    }

    // Get All Products
    @GetMapping("/getallprod")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    // Get Product by ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product product = productService.getProductById(id);
        return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
    }

    // Delete Product
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok("Product deleted successfully!");
    }
}
