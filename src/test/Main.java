package test;

import entity.Order;
import service.OrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Order order = new Order(1, 3, Map.of(1,1), 10d);
        OrderService orderService = new OrderService();
        orderService.placeOrderOnList(order);
    }
}