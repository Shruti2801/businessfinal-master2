package com.example.business.model;

import javax.persistence.*;

@Entity
public class Service {

    @Id
    private int sid;

    private String servicename;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "s_id")
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Service() {
    }

    public Service( int id ,String servicename) {
        this.sid = id;
        this.servicename = servicename;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public int getId() {
        return sid;
    }

    public void setId(int id) {
        this.sid = id;
    }
}
