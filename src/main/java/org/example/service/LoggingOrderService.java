package org.example.service;

import org.example.model.Order;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

@Service
public class LoggingOrderService implements OrderService {

    @Override
    public void placeOrder(Order order) {
        System.out.println("Logging order placement: " + order);
    }

    @Override
    public List<Order> getOrders() {
        return Collections.emptyList();
    }
}
