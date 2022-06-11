package com.example.learnservlet.Services;

import com.example.learnservlet.dao.ProductDao;
import com.example.learnservlet.dao.ProductDaoImpl;
import com.example.learnservlet.entity.Product;


import java.util.List;

public class ProductServicesImpl implements ProductServices{
    @Override
    public List<Product> getAllProduct() {
        ProductDao productDao=new ProductDaoImpl();
        return productDao.getAllProduct();
    }

    @Override
    public void createProduct() {

    }

    @Override
    public void searchProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void updateProduct() {

    }
}
