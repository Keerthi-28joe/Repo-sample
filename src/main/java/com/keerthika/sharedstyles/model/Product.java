package com.keerthika.sharedstyles.model;//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

import jakarta.persistence.*;


@Entity
//@Table(name = "sharedstyles")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

//    @Column(name = "name", nullable = false)
    private String name;

//    @Column(name = "price", nullable = false)
    private double price;

//    @Column(name = "stock")
    private int stock;

//    @Column(name = "image_url")
    private String imageUrl;

    // Default constructor
    public Product() {
    }

//    // Parameterized constructor
//    public Product(String name, double price, int stock, String imageUrl) {
//        this.name = name;
//        this.price = price;
//        this.stock = stock;
//        this.imageUrl = imageUrl;
//    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

//    @Override
//    public String toString() {
//        return "Product{" +
//                "productId=" + productId +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                ", stock=" + stock +
//                ", imageUrl='" + imageUrl + '\'' +
//                '}';
//    }

