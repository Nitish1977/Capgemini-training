package org.example.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "customer",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true)
    private List<Product> products = new ArrayList<>();

    // Constructor
    public Customer() {}

    public Customer(String name) {
        this.name = name;
    }

    // Helper Method (Important)
    public void addProduct(Product product) {
        products.add(product);
        product.setCustomer(this);
    }

    // Getters & Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }
}
