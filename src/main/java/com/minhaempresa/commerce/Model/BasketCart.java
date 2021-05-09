package com.minhaempresa.commerce.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class BasketCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    public Integer getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(Integer cdCliente) {
        this.cdCliente = cdCliente;
    }

    private Integer cdCliente;
    @OneToMany
    private List<BasketCartItem> Itens ;
    private double TotalPrice;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public List<BasketCartItem> getItens() {
        return Itens;
    }

    public void setItens(List<BasketCartItem> itens) {
        Itens = itens;
    }

    public double getTotalPrice() {
         TotalPrice = 0;
         for(BasketCartItem item : Itens){
             TotalPrice += item.getPrice() * 1;
         }
         return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }



}
