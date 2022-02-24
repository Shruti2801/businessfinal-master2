
package com.example.business.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sales_contact {
    @Id
    private int id;
    private String contact_person_name;
    private String designation;
    private String person_qualification;
    private int contact_no1;
    private int contact_no2;
    private int contact_no3;
    private String Email_id1;
    private String Email_id2;
    private String Email_id3;








    //    @ManyToOne(fetch = FetchType.LAZY)
//    private Branch branch;



    public Sales_contact() {
    }

    public Sales_contact(int id, String contact_person_name, String designation, String person_qualification, int contact_no1, int contact_no2, int contact_no3, String email_id1, String email_id2, String email_id3) {
        this.id = id;
        this.contact_person_name = contact_person_name;
        this.designation = designation;
        this.person_qualification = person_qualification;
        this.contact_no1 = contact_no1;
        this.contact_no2 = contact_no2;
        this.contact_no3 = contact_no3;
        Email_id1 = email_id1;
        Email_id2 = email_id2;
        Email_id3 = email_id3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail_id1() {
        return Email_id1;
    }

    public void setEmail_id1(String email_id1) {
        Email_id1 = email_id1;
    }

    public String getEmail_id2() {
        return Email_id2;
    }

    public void setEmail_id2(String email_id2) {
        Email_id2 = email_id2;
    }

    public String getEmail_id3() {
        return Email_id3;
    }

    public void setEmail_id3(String email_id3) {
        Email_id3 = email_id3;
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

    public String getPerson_qualification() {
        return person_qualification;
    }

    public void setPerson_qualification(String person_qualification) {
        this.person_qualification = person_qualification;
    }
}
