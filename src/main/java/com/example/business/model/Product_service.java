package com.example.business.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product_service {
    @Id
    private int id;
    private String name;
    private String type;
    private String description;








//    @ManyToOne(fetch = FetchType.LAZY)
//    private Company company;

    public Product_service() {
    }

    public Product_service(int id, String name, String type, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

