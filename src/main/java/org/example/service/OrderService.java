package org.example.service;

import org.example.model.Order;
import java.util.List;

public interface OrderService {
    void placeOrder(Order order);
    List<Order> getOrders();
}
