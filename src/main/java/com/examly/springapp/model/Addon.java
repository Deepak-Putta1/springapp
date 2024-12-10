package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Addon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addonId;
    private String addOnsName;
    private Integer addOnsPrice;
    private String addOnsImageurl;


    public Addon() {
    }

    public Addon(Integer addonId, String addOnsName, Integer addOnsPrice, String addOnsImageurl) {
        this.addonId = addonId;
        this.addOnsName = addOnsName;
        this.addOnsPrice = addOnsPrice;
        this.addOnsImageurl = addOnsImageurl;
    }

    public Integer getAddonId() {
        return addonId;
    }

    public void setAddonId(Integer addonId) {
        this.addonId = addonId;
    }

    public String getAddOnsName() {
        return addOnsName;
    }

    public void setAddOnsName(String addOnsName) {
        this.addOnsName = addOnsName;
    }

    public Integer getAddOnsPrice() {
        return addOnsPrice;
    }

    public void setAddOnsPrice(Integer addOnsPrice) {
        this.addOnsPrice = addOnsPrice;
    }

    public String getAddOnsImageurl() {
        return addOnsImageurl;
    }

    public void setAddOnsImageurl(String addOnsImageurl) {
        this.addOnsImageurl = addOnsImageurl;
    }
}
