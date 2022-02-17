package com.example.business.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
//@Table(name = "COMPANY")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "C_ID")
    private int id;

//    @Column(name = "COMPANY_NAME")
    private String companyname;

//    @Column(name = "TIMING")
    private String timing;

//    @Column(name = "ADDRESS")
    private String address;

//    @Column(name = "EMAIL")
    private String email;

//    @Column(name = "CONTACT_NO")
    private  int contact;


    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<Product> product;

    @OneToMany(targetEntity = Service.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cs_fk",referencedColumnName = "id")
    private List<Service> service;

//    private List<String> services;

    public Company(String address) {
        this.address = address;
    }

    public Company(int id, String companyname, String timing,String address,String email,int contact) {
        this.id = id;
        this.address = address;
        this.timing=timing;
        this.companyname=companyname;
        this.email=email;
        this.contact=contact;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public List<Service> getService() {
        return service;
    }

    public void setService(List<Service> service) {
        this.service = service;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTiming() {
        return timing;
    }
    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getCompanyname() {
        return companyname;
    }
    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
