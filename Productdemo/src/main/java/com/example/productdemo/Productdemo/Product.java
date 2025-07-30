package com.example.productdemo.Productdemo;

public class Product {
	private String name;
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void displayProductInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Description: " + description);
}
}
