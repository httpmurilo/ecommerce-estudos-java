package com.minhaempresa.commerce.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //1:1
    private Integer Id;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @JsonProperty("user_id")
    private User user;

    public boolean isHasActiveClient() {
        return HasActiveClient;
    }

    public void setHasActiveClient(boolean hasActiveClient) {
        HasActiveClient = hasActiveClient;
    }

    private boolean HasActiveClient;
}
