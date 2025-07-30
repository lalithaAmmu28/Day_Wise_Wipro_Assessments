package com.example.productdemo.Productdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductdemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Product product = (Product) context.getBean("product");

        product.displayProductInfo();
    }
}