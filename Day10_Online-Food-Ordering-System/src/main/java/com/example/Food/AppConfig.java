package com.example.Food;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    
    @Bean
    public Customer customer() {
        return new Customer("Lalitha", "1234567890", "South Indian");
    }

    @Bean
    public Restaurant restaurant() {
        return new Restaurant("Spicy Treats", "Vizag", new String[]{"North Indian", "South Indian"});
    }

    @Bean
    public FoodOrderService foodOrderService() {
        return new FoodOrderService(customer(), restaurant());
    }
}
