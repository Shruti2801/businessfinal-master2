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
    private String name;
    private String description;
    private String tagline;
    private  String logourl;
    private  String website;




    @OneToMany(targetEntity = Product_service.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cps_fk",referencedColumnName = "id")
    private List<Product_service> product_services;

//    @OneToMany(targetEntity = Sales_contact.class,cascade = CascadeType.ALL)
//    @JoinColumn(name ="cs_fk",referencedColumnName = "id")
//    private List<Sales_contact> sales_contacts;

    @OneToMany(targetEntity = Branch.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cb_fk",referencedColumnName = "id")
    private List<Branch> branches;

    public Company(int id, String name,String description, String tagline, String logourl, String website) {
        this.id = id;
        this.name=name;
        this.description=description;
        this.tagline=tagline;
        this.logourl=logourl;
        this.website=website;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

//    public List<Sales_contact> getSales_contacts() {
//        return sales_contacts;
//    }
//
//    public void setSales_contacts(List<Sales_contact> sales_contacts) {
//        this.sales_contacts = sales_contacts;
//    }

    public List<Product_service> getProduct_services() {
        return product_services;
    }

    public void setProduct_services(List<Product_service> product_services) {
        this.product_services = product_services;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
