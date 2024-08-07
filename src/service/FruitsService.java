package service;

import entity.Fruit;
import entity.Order;
import entity.Vegetable;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class FruitsService {
    private Map<Integer, Fruit> fruits;
    private Timestamp timestamp;


    public FruitsService() {
        this.fruits = new HashMap<>();
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public void addFruits(Fruit fruit) {
        fruits.put(fruit.getId(), fruit);
    }

    public void getFruits(){

    }
    public void showFruits(Map<Integer, Fruit> fruits){
        for (Map.Entry<Integer, Fruit> entry : fruits.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
