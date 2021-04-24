package com.minhaempresa.commerce.Model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String Name;

    @OneToOne(cascade = CascadeType.ALL)
    private Category categoryId;
    private String Summary;
    private String ImageFile;
    private String Price;

}
