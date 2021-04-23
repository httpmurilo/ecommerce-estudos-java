package com.minhaempresa.commerce.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Product {

    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer Id;
    private String Name;

    @OneToOne(cascade = CascadeType.ALL)
    private Category categoryId;
    private String Summary;
    private String ImageFile;
    private String Price;

}
