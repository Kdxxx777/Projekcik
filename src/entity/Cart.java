package entity;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Integer, Integer> items;  // Mapa id warzywa i ilości w koszyku

    public Cart() {
        this.items = new HashMap<>();
    }

    public void addToCartVegetable(int vegetableId, int quantity) {
        items.put(vegetableId, items.getOrDefault(vegetableId, 0) + quantity);
    }

    public void addToCartFruit(int fruitId, int quantity) {
        items.put(fruitId, items.getOrDefault(fruitId, 0) + quantity);
    }
}
