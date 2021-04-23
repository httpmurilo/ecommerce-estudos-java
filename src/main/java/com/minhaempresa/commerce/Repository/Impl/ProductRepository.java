package com.minhaempresa.commerce.Repository.Impl;

import com.minhaempresa.commerce.Model.Category;
import com.minhaempresa.commerce.Model.Product;
import com.minhaempresa.commerce.Repository.Interfaces.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductRepository {

    @Autowired
    IProductRepository _repository;

    public void saveProduct(Product product){
        _repository.save(product);
    }
}
