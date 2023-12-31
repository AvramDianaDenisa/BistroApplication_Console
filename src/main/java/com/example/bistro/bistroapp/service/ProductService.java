package com.example.bistro.bistroapp.service;

import com.example.bistro.bistroapp.entity.Product;
import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProductPrice(Long id, double newPrice);
    void removeProduct(Long id);
    Product getProductWithIngredients(Long id);

    List<Product> getTopProducts(int count);

    List<Product> getTopMostWantedProducts(int count);
}
