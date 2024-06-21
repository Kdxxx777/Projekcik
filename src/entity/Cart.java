package entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cart {

    private Map<Integer, Integer> items;  // Mapa id warzywa i ilości w koszyku

    public Cart() {
        this.items = new HashMap<>();
    }

    public void addToCartVegetable(int vegetableId, int quantity) {
        items.put(vegetableId, items.getOrDefault(vegetableId, 0) + quantity);
    }


    /**
     * Adds a specified quantity of a fruit to the shopping cart.
     * If the fruit is already in the cart, its quantity is increased.
     *
     * @param fruitId   The unique identifier of the fruit to be added.
     * @param quantity  The amount of the fruit to add (must be greater than zero).
     */

    public void addToCartFruit(int fruitId, int quantity) {
        items.put(fruitId, items.getOrDefault(fruitId, 0) + quantity);
    }


    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(items, cart.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}
