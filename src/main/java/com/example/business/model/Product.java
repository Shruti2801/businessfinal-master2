package com.example.business.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    private int pid;
    private String productname;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "s_id")
    private Company company;

    public Product() {}

    public Product( int id,String productname) {
        this.pid = id;
        this.productname=productname;
//        this.student = student;
    }


    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getId() {
        return pid;
    }

    public void setId(int id) {
        this.pid = id;
    }


}
