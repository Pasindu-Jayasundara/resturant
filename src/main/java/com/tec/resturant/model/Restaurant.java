package com.tec.resturant.model;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    private int id;

    private String name;
    private String location;
    private double rating;
    private String cuisine;

    public Restaurant(int id, String name, String location, double rating, String cuisine) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.cuisine = cuisine;
    }

    public Restaurant() {
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
