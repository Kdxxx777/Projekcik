package service;

import entity.Fruits;
import entity.Order;
import entity.Vegetable;

import java.util.HashMap;
import java.util.Map;

public class FruitsService {
    private Map<Integer, Fruits> fruits;

    public FruitsService() {
        this.fruits = new HashMap<>();
    }

    public void addFruits(Fruits fruit) {
        fruits.put(fruit.getId(), fruit);
    }
}
