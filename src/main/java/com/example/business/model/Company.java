package com.example.business.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "COMPANY")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String company_name;
    private int government_id;
    private String description;
    private String tagline;
    private String logo_url;
    private String company_website;
    private String established_since;
    private String telegram_link;
    private String whatsapp_link;
    private String youtube_link;
    private String facebook_link;
    private String instagram_link;
    private String linkedin_url;
    private String twitter_link;


    @OneToMany(targetEntity = Product_service.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cps_fk",referencedColumnName = "id")
    private List<Product_service> product_services;


    @OneToMany(targetEntity = Branch.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cb_fk",referencedColumnName = "id")
    private List<Branch> branches;

    @OneToMany(targetEntity = Industry_sector.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ci_fk",referencedColumnName = "id")
    private List<Industry_sector> industry_sectors;



    public List<Industry_sector> getIndustry_sectors() {
        return industry_sectors;
    }

    public void setIndustry_sectors(List<Industry_sector> industry_sectors) {
        this.industry_sectors = industry_sectors;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public List<Product_service> getProduct_services() {
        return product_services;
    }

    public void setProduct_services(List<Product_service> product_services) {
        this.product_services = product_services;
    }

    public int getGovernment_id() {
        return government_id;
    }

    public void setGovernment_id(int government_id) {
        this.government_id = government_id;
    }

    public String getFacebook_link() {
        return facebook_link;
    }

    public void setFacebook_link(String facebook_link) {
        this.facebook_link = facebook_link;
    }

    public String getInstagram_link() {
        return instagram_link;
    }

    public void setInstagram_link(String instagram_link) {
        this.instagram_link = instagram_link;
    }

    public String getLinkedin_url() {
        return linkedin_url;
    }

    public void setLinkedin_url(String linkedin_url) {
        this.linkedin_url = linkedin_url;
    }

    public String getTwitter_link() {
        return twitter_link;
    }

    public void setTwitter_link(String twitter_link) {
        this.twitter_link = twitter_link;
    }

    public String getYoutube_link() {
        return youtube_link;
    }

    public void setYoutube_link(String youtube_link) {
        this.youtube_link = youtube_link;
    }

    public String getWhatsapp_link() {
        return whatsapp_link;
    }

    public void setWhatsapp_link(String whatsapp_link) {
        this.whatsapp_link = whatsapp_link;
    }

    public String getTelegram_link() {
        return telegram_link;
    }

    public void setTelegram_link(String telegram_link) {
        this.telegram_link = telegram_link;
    }

    public String getEstablished_since() {
        return established_since;
    }

    public void setEstablished_since(String established_since) {
        this.established_since = established_since;
    }



    public String getCompany_website() {
        return company_website;
    }

    public void setCompany_website(String company_website) {
        this.company_website = company_website;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
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

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
