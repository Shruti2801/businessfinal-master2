package com.example.business.model;

import javax.persistence.*;

@Entity
public class Sales_contact {
    @Id
    private int id;

    private String contact_person_name;
    private String designation;
    private int contact_no1;
    private int contact_no2;
    private int contact_no3;
    private String Email1;
    private String Email2;
    private String Email3;


    @ManyToOne(fetch = FetchType.LAZY)
    private Branch branch;

    public Sales_contact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sales_contact(int id, String contact_person_name, String designation, int contact_no1, int contact_no2, int contact_no3, String email1, String email2, String email3) {
        this.id = id;
        this.contact_person_name = contact_person_name;
        this.designation = designation;
        this.contact_no1 = contact_no1;
        this.contact_no2 = contact_no2;
        this.contact_no3 = contact_no3;
        Email1 = email1;
        Email2 = email2;
        Email3 = email3;

    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }

    public String getEmail3() {
        return Email3;
    }

    public void setEmail3(String email3) {
        Email3 = email3;
    }

    public String getEmail2() {
        return Email2;
    }

    public void setEmail2(String email2) {
        Email2 = email2;
    }

    public String getEmail1() {
        return Email1;
    }

    public void setEmail1(String email1) {
        Email1 = email1;
    }

    public int getContact_no3() {
        return contact_no3;
    }

    public void setContact_no3(int contact_no3) {
        this.contact_no3 = contact_no3;
    }

    public int getContact_no2() {
        return contact_no2;
    }

    public void setContact_no2(int contact_no2) {
        this.contact_no2 = contact_no2;
    }

    public int getContact_no1() {
        return contact_no1;
    }

    public void setContact_no1(int contact_no1) {
        this.contact_no1 = contact_no1;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getContact_person_name() {
        return contact_person_name;
    }

    public void setContact_person_name(String contact_person_name) {
        this.contact_person_name = contact_person_name;
    }
}
