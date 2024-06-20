package service;

import entity.Fruit;
import entity.Order;
import entity.Vegetable;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;

public class FruitsService {
    private Map<Integer, Fruit> fruits;

    public FruitsService() {
        this.fruits = new HashMap<>();
    }

    public void addFruits(Fruit fruit) {
        fruits.put(fruit.getId(), fruit);
    }

    public void getFruits() {

    }

    public void showFruits(Map<Integer, Fruit> fruits) {
        for (Map.Entry<Integer, Fruit> entry : fruits.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public boolean getChosenFruit(Map<Integer, Fruit> fruits, String fruitName) {
        for (Map.Entry<Integer, Fruit> entry : fruits.entrySet()) {
            if (entry.getValue().getName().equals(fruitName)) {
                System.out.println(fruitName + " is in fruits list.");
                return true;
            }
        }
        System.out.println(fruitName + "is not in fruits list.");
        return false;
    }
}
