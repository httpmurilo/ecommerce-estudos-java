package com.minhaempresa.commerce.Model;

import com.minhaempresa.commerce.Enum.EPaymentMethod;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BasketCheckout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCdUser() {
        return CdUser;
    }

    public void setCdUser(String cdUser) {
        CdUser = cdUser;
    }

    public Double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmailAdress() {
        return EmailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        EmailAdress = emailAdress;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getCardName() {
        return CardName;
    }

    public void setCardName(String cardName) {
        CardName = cardName;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getExpiration() {
        return Expiration;
    }

    public void setExpiration(String expiration) {
        Expiration = expiration;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public EPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethodHisBoleto(EPaymentMethod paymentMethod) {
        this.paymentMethod = EPaymentMethod.BOLETO;
    }

    public void setPaymentMethodHisCredito(EPaymentMethod paymentMethod) {
        this.paymentMethod = EPaymentMethod.CREDITO;
    }

    public void setPaymentMethodHisCrediario(EPaymentMethod paymentMethod) {
        this.paymentMethod = EPaymentMethod.CREDIARIO;
    }

    public void setPaymentMethodHisDebito(EPaymentMethod paymentMethod) {
        this.paymentMethod = EPaymentMethod.DEBITO;
    }




    private String CdUser;
    private Double TotalPrice;
    private String FirstName;
    private String LastName;
    private String EmailAdress;
    private String Country;
    private String State;
    private String ZipCode;
    private String CardName;
    private String CardNumber;
    private String Expiration;
    private String CVV;
    private EPaymentMethod paymentMethod;
}
