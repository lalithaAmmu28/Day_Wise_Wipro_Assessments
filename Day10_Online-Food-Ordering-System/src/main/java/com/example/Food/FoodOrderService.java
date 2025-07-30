package com.example.Food;

public class FoodOrderService {
    private Customer customer;
    private Restaurant restaurant;

    public FoodOrderService(Customer customer, Restaurant restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
    }

    public void placeOrder() {
        if (restaurant.servesCuisine(customer.getPreferredCuisine())) {
            System.out.println("Order placed at " + restaurant + " for " + customer);
        } else {
            System.out.println("No matching cuisine found for " + customer.getPreferredCuisine());
        }
    }
}
