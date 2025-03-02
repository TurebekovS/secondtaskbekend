package org.example;

import org.example.config.AppConfig;
import org.example.model.Order;
import org.example.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        OrderService loggingService = context.getBean("loggingService", OrderService.class);

        loggingService.placeOrder(new Order(1, "Laptop"));
    }
}
