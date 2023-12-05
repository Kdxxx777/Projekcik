package entity;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Integer, Integer> items;  // Mapa id warzywa i ilości w koszyku

    public Cart() {
        this.items = new HashMap<>();
    }

    public void addToCart(int vegetableId, int quantity) {
        items.put(vegetableId, items.getOrDefault(vegetableId, 0) + quantity);
    }
}
