package com.example.lombok;

public class Product2 {
    private int weight;
    private String description;

    public int getWeight() {
        return weight;
    }

    public Product2 setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product2 setDescription(String description) {
        this.description = description;
        return this;
    }
}
