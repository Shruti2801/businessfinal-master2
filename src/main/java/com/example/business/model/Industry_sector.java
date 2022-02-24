package com.example.business.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Industry_sector {
    @Id
    private int industry_id;
    private String industry_name;

    public Industry_sector() {
    }


    public String getIndustry_name() {
        return industry_name;
    }

    public void setIndustryName(String industry_name) {
        this.industry_name = industry_name;
    }

    public int getIndustryId() {
        return industry_id;
    }

    public void setIndustryId(int industry_id) {
        this.industry_id = industry_id;
    }

    public Industry_sector(int industry_id, String industry_name) {
        this.industry_id = industry_id;
        this.industry_name = industry_name;
    }
}
