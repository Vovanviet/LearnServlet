package com.example.learnservlet.Services;

import com.example.learnservlet.entity.Product;


import java.util.List;

public interface ProductServices {
    List<Product>getAllProduct();
    void createProduct();
    void searchProduct();
    void deleteProduct();
    void updateProduct();
}
