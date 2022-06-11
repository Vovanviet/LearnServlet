package com.example.learnservlet.controller;



import com.example.learnservlet.Services.ProductServices;
import com.example.learnservlet.Services.ProductServicesImpl;
import com.example.learnservlet.dao.ProductDao;
import com.example.learnservlet.dao.ProductDaoImpl;
import com.example.learnservlet.entity.Product;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet(name = "api",value = "/api")
public class ProductController extends HttpServlet {
    private List<Product> api;

    public List<Product>getAllProduct(){
        ProductServices productServices=new ProductServicesImpl();
        return productServices.getAllProduct();

    }
    public void createProduct(Product product){
        ProductDao productDao=new ProductDaoImpl();
        productDao.createProduct(product);
    }
    public void deleteProduct(String name){
        ProductDao productDao=new ProductDaoImpl();
        productDao.deleteProduct(name);
    }
    public void updateProduct(Product product){
        ProductDao productDao=new ProductDaoImpl();
        productDao.updateProduct(product);
    }
    public void searchProduct(String name){
        ProductDao productDao=new ProductDaoImpl();
        productDao.searchProduct(name);
    }
    @Override
    public void init() throws ServletException {
        api= getAllProduct();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        PrintWriter out=resp.getWriter();
        out.println(api);
    }



    @Override
    public void destroy() {

    }
}
