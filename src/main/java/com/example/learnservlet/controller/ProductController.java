package com.example.learnservlet.controller;



import com.example.learnservlet.Services.ProductServices;
import com.example.learnservlet.Services.ProductServicesImpl;
import com.example.learnservlet.dao.ProductDao;
import com.example.learnservlet.dao.ProductDaoImpl;
import com.example.learnservlet.entity.Product;



import javax.servlet.http.HttpServlet;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.List;
@Path("generic")
public class ProductController extends HttpServlet {
    private List<Product> api;
    @Path("getAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Product>getAllProduct(){
        ProductServices productServices=new ProductServicesImpl();
        return productServices.getAllProduct();

    }
    @Path("createProduct")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void createProduct(
            @QueryParam("proName") String proName,
            @QueryParam("proDesc") String proDesc,
            @QueryParam("Price") Double Price

    ){

        Product product=new Product(proName,proDesc,Price);
        ProductDao productDao=new ProductDaoImpl();
        productDao.createProduct(product);
    }

    @DELETE
    @Path("deleteProduct")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteProduct(@QueryParam("proName") String name){
        ProductDao productDao=new ProductDaoImpl();
        productDao.deleteProduct(name);
    }

    @POST
    @Path("updateProduct")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateProduct(@QueryParam("proName") String proName,@QueryParam("proDesc") String proDesc,@QueryParam("Price")Double Price){
        Product product=new Product(proName,proDesc,Price);
        ProductDao productDao=new ProductDaoImpl();
        productDao.updateProduct(product);
    }
    @GET
    @Path("search/name")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void searchProduct(@QueryParam("proName") String name){
        ProductDao productDao=new ProductDaoImpl();
        productDao.searchProduct(name);
    }

}
