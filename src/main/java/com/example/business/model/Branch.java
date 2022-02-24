package com.example.business.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Branch {
    @Id
    private int branch_id;
    private String state;
    private String city;
    private String address;
    private int zipcode;
    private String timing;
    private String branch_type;
    private String gst_no;

    @OneToMany(targetEntity = Sales_contact.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="bs_fk",referencedColumnName = "branch_id")
    private List<Sales_contact> sales_contacts;











//    @ManyToOne(fetch = FetchType.LAZY)
//  private Company company;

    public List<Sales_contact> getSales_contacts() {
        return sales_contacts;
    }

    public void setSales_contacts(List<Sales_contact> sales_contacts) {
        this.sales_contacts = sales_contacts;
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


    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_type() {

        return branch_type;
    }

    public void setBranch_type(String branch_type) {
        this.branch_type = branch_type;
    }

    public String getGst_no() {
        return gst_no;
    }

    public void setGst_no(String gst_no) {
        this.gst_no = gst_no;
    }

    public Branch(int branch_id, String state, String city, String address, int zipcode, String timing, String branch_type, String gst_no) {
        this.branch_id = branch_id;
        this.state = state;
        this.city = city;
        this.address = address;
        this.zipcode = zipcode;
        this.timing = timing;
        this.branch_type = branch_type;
        this.gst_no = gst_no;
    }

}

