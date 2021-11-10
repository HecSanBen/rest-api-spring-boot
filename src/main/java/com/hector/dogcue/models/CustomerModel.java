package com.hector.dogcue.models;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String postal_address;
    private String email;
    private String sms;

    protected enum contact_preferences {
        POSTAL, EMAIL, SMS
    }

    public CustomerModel(Long id, String postal_address, String email, String sms) {
        this.id = id;
        this.postal_address = postal_address;
        this.email = email;
        this.sms = sms;
    }

    public CustomerModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPostal_address(String postal_address) {
        this.postal_address = postal_address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getPostal_address() {
        return postal_address;
    }

    public String getEmail() {
        return email;
    }

    public String getSms() {
        return sms;
    }

}
