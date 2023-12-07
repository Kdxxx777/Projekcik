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

    public Fruits findFruitByID(int id) {
        for (Map.Entry<Integer, Fruits> entry : fruits.entrySet()) {
            Fruits fruit = entry.getValue();

            if (fruit.getId() == id) {
                return fruit;
            }
        }
        return null;
    }

    public Map<Integer, Fruits> getFruits() {
        return fruits;
    }
}
