package com.example.Food;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);

        FoodOrderService service = context.getBean(FoodOrderService.class);
        service.placeOrder();

        context.close();
    }
}

