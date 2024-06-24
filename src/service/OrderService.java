package service;

import entity.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderService {

    private Map<Integer, Order> orders;
    private int nextOrderId;

    public OrderService() {
        this.orders = new HashMap<>();
        this.nextOrderId = 1;
    }

    public void placeOrderOnList(Order order) {
        orders.put(5, order);
    }

    // Metoda do składania nowego zamówienia
    public Order placeOrder(int customerId, Map<Integer, Integer> items, double total) {
        Order newOrder = new Order(nextOrderId++, customerId, items, total);
        orders.put(newOrder.getOrderId(), newOrder);
        return newOrder;
    }
}
