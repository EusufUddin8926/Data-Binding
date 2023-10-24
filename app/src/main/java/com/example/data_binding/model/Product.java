package com.example.data_binding.model;

public class Product {
    private String itemId;
    private String name;
    private String description;
    private double price;
    private double salePrice;
    private float rating;
    private int totalRatings;
    private String image;

    public Product(String itemId, String name, String description, double price, double salePrice, float rating, int totalRatings, String image) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.salePrice = salePrice;
        this.rating = rating;
        this.totalRatings = totalRatings;
        this.image = image;
    }

    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public float getRating() {
        return rating;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public String getImage() {
        return image;
    }
}
