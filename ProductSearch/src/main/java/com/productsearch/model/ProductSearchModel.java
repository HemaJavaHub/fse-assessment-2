package com.productsearch.model;

import javax.persistence.*;

@Entity
public class ProductSearchModel {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
    private String category;

    private String brand;
    private String color;
    private int price;



    public ProductSearchModel(Integer id, String category, String brand, String color, int price) {
        this.id = id;
        this.category = category;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }





    public ProductSearchModel() {	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}
