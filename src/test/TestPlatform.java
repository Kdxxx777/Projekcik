package test;

import entity.Cart;
import entity.Vegetable;

public class TestPlatform {
    public static void main(String[] args) {
        Vegetable vegetable1 = new Vegetable(1,"Pomidor",5.99,5);
        Cart cart1 = new Cart();
        cart1.addToCartVegetable(1,2);
    }
}
