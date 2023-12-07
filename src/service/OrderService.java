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
        System.out.println("ABC");
    }

    public void placeOrderOnList(Order order) {
        orders.put(5, order);
    }

    public double calculatedDiscount(double totalAmount, double discount) {
        if (discount == 0) {
            return totalAmount;
        } else {
            return (totalAmount * discount) + totalAmount;
        }
    }

    // Metoda do składania nowego zamówienia
    public Order placeOrder(int customerId, Map<Integer, Integer> items, double totalAmount) {
        Order newOrder = new Order(nextOrderId++, customerId, items, totalAmount);
        orders.put(newOrder.getOrderId(), newOrder);
        return newOrder;
    }
}
