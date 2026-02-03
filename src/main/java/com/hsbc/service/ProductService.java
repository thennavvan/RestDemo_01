package com.hsbc.service;

import com.hsbc.entity.Product;
import com.hsbc.exception.InvalidException;
import com.hsbc.repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

    public Product findProduct(int id) throws Exception{
        Optional<Product> optionalProduct = productRepo.findById(id);
        return optionalProduct.orElseThrow(
                () -> new InvalidException("ID is not valid"+id)
        );
    }

    public Product updateProduct(Product product) throws Exception{
        findProduct(product.getId());
        return productRepo.save(product);
    }

    public List<Product> findAllProducts(){
        return productRepo.findAll();
    }

    public Product deleteProduct(int id) throws Exception{
        Product product = findProduct(id);
        productRepo.deleteAllById(Collections.singleton(id));
        return product;
    }



    public List<Product> findProductsByName(String name){
        List<Product> products = productRepo.findByName(name);

        return products;
    }

    public List<Product> findByPartialName(String name){
        List<Product> products = productRepo.findByPartialName(name);
        return products;
    }


}
