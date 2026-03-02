package com.example.productApp.service;


import com.example.productApp.Repository.ProductRepository;
import com.example.productApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private  final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public  void saveProduct(Product product){
        productRepository.save(product);
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id){ // in case it will return null it will handle that exception or error.
        return productRepository.findById(id);
    }
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
