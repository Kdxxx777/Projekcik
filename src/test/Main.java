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
        OrderService orderService = new OrderService();
        orderService.placeOrderOnList(order);
        System.out.println("Hello, user");
        System.out.println("Good Morning");

        List<String> orders = new ArrayList<>();
        String order2 = "Order 2";
        orders.add(order2);

        String order3 = "Order 3";
        orders.add(order3);
    }
}