package test;

import entity.Fruits;
import entity.Order;
import service.OrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("To ja Fabian.");
        Order order = new Order(1, 3, Map.of(1, 1), 10d);
        OrderService orderService = new OrderService();
        orderService.placeOrderOnList(order);

        Fruits fruits = new Fruits(1, "Jablko", 15.99, 1, "Afryka");
        System.out.println(fruits.getCountryOfOrigin());
        String nameOfFruit = fruits.getName();
        System.out.println(nameOfFruit);
        System.out.println("cena " + nameOfFruit + " wynosi: " + fruits.getPrice());

    }
}