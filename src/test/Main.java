package test;

import entity.Order;
import service.OrderService;

import java.util.*;

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



        UUID uuid = UUID.randomUUID();
        String orderID = "Order_" + uuid.toString();

        System.out.println(orderID);


    }
}