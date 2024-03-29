package service;

import entity.Fruit;
import entity.Order;
import entity.Vegetable;

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

    public void getFruits(){

    }
    public void showFruits(Map<Integer, Fruits> fruits){
        for (Map.Entry<Integer, Fruits> entry : fruits.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
