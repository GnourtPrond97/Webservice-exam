package com.example.stringbootws.service;

import com.example.stringbootws.entity.Product;
import com.example.stringbootws.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.Optional;

@Component(value = "ProductService")
@WebService
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @WebMethod
    public boolean addProduct(Product p){
        productRepository.save(p);
        return  true;
    }
    @WebMethod
    public List<Product> getAllProducts(){
        List<Product> list  = productRepository.findAll();

        return  list;

    }

    @WebMethod
    public boolean sellProduct(String productId, int quantity){
        Optional<Product> product = productRepository.findById(productId);
        if(product == null){
            return false;
        }
        product.get().setQuantity(quantity);


        return  true;

    }

}
