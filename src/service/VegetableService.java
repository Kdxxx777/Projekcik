package service;

import entity.Vegetable;

import java.util.HashMap;
import java.util.Map;

public class  VegetableService {

    private Map<Integer, Vegetable> vegetables;

    public VegetableService() {
        this.vegetables = new HashMap<>();
    }

    public void addVegetable(Vegetable vegetable) {
        vegetables.put(Integer.valueOf(vegetable.getId()), vegetable);
    }

    public void deleteVegetable(Vegetable vegetable) {
        vegetables.remove(vegetable.getId(), vegetable);
    }

    public Map<Integer, Vegetable> getVegetables() {
        return vegetables;
    }
}
