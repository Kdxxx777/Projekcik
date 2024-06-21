package service;

import entity.Vegetable;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class VegetableService {

    private Map<Integer, Vegetable> vegetables;
    private LocalDateTime timestamp;

    public VegetableService() {
        this.vegetables = new HashMap<>();
        this.timestamp = LocalDateTime.now();
    }

    public void addVegetable(Vegetable vegetable) {
        vegetables.put(vegetable.getId(), vegetable);
    }

    public void deleteVegetable(Vegetable vegetable) {
        vegetables.remove(vegetable.getId(), vegetable);
    }

    public Map<Integer, Vegetable> getVegetables() {
        return vegetables;
    }

    public void showVegetables(Map<Integer, Vegetable> vegetableMap) {
        for (Map.Entry<Integer, Vegetable> entry : vegetableMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

