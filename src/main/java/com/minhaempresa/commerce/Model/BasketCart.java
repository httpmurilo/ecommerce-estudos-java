package com.minhaempresa.commerce.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class BasketCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Integer cdCliente;
    private boolean hasProcessed;
    @OneToMany
    private List<BasketCartItem> Itens ;

    public boolean isHasProcessed() {
        return hasProcessed;
    }

    public void setHasProcessed(boolean hasProcessed) {
        this.hasProcessed = hasProcessed;
    }



    public Integer getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(Integer cdCliente) {
        this.cdCliente = cdCliente;
    }



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

}
