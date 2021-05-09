package com.minhaempresa.commerce.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BasketCartItem {

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public List<Product> getProductList() {
        return ProductList;
    }

    public void setProductList(List<Product> productList) {
        ProductList = productList;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private double Price;
    @OneToMany
    private List<Product> ProductList ;
}
