package com.example.business.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Branch {
    @Id
    private int branchid;
    private String state;
    private String city;
    private String address;
    private int zipcode;
    private String timing;

    @OneToMany(targetEntity = Sales_contact.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="bs_fk",referencedColumnName = "branchid")
    private List<Sales_contact> sales_contacts;


    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    public List<Sales_contact> getSales_contacts() {
        return sales_contacts;
    }

    public void setSales_contacts(List<Sales_contact> sales_contacts) {
        this.sales_contacts = sales_contacts;
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Branch() {
    }


    public int getBranchid() {
        return branchid;
    }

    public void setBranchid(int branchid) {
        this.branchid = branchid;
    }

    public Branch(int branchid, String state, String city, String address, int zipcode, String timing) {
        this.branchid = branchid;
        this.state = state;
        this.city = city;
        this.address = address;
        this.zipcode = zipcode;
        this.timing = timing;
    }

}
