package test;

import entity.Order;
import service.OrderService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("To ja Fabian.");
        System.out.println("To ja Kamil");
        System.out.printf("test2");
        Order order = new Order(1, 3, Map.of(1,1), 10d);
        Order order1 = new Order(3, 2, Map.of(1,2), 200);
        Order order2 = new Order(2, 4, Map.of(1,3), 20d);
        OrderService orderService = new OrderService();
        orderService.placeOrderOnList(order);
        orderService.placeOrderOnList(order1);
        orderService.placeOrderOnList(order2);
        System.out.println("Hello, user");
        System.out.println("Good Morning");
    }
}