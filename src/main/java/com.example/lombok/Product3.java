package com.example.lombok;

public class Product3 {
    private int weight;
    private String description;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int weight;
        private String description;

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Product3 build() {
            Product3 product3 = new Product3();
            product3.setDescription(description);
            product3.setWeight(weight);
            return product3;
        }
    }
}
