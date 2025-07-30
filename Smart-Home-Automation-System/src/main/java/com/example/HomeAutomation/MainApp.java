package com.example.HomeAutomation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);

        AutomationService service = context.getBean(AutomationService.class);
        service.controlDevice();

        context.close();
    }
}
