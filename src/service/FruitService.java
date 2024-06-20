package service;

import entity.Fruit;

import java.util.HashMap;
import java.util.Map;

public class FruitService {
    private Map<Integer, Fruit> fruits;

    public FruitService() {
        this.fruits = new HashMap<>();
    }

    public void addFruits(Fruit fruit) {
        fruits.put(fruit.getId(), fruit);
    }

    public void getFruits(){

    }
}
