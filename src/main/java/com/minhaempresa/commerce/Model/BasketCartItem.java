package com.minhaempresa.commerce.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class BasketCartItem {

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
    @OneToMany
    private List<Product> ProductList ;

    double calculateAllPriceFromItens(List<Product> listOfProducts){
        double totalPriceToReturn =0;
        for(Product  item : listOfProducts){
            totalPriceToReturn += item.getPrice()  * 1;
        }
        return totalPriceToReturn;
    }
}
