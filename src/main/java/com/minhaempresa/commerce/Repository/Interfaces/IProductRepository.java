package com.minhaempresa.commerce.Repository.Interfaces;

import com.minhaempresa.commerce.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product,Integer> {
}
