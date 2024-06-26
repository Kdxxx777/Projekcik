package entity;

import java.util.Objects;

public class Fruit {
    private int id;
    private String wrongName;
    private double price;
    private int quantity;
    private String countryOfOrigin;


    public Fruit(int id, String wrongName, double price, int quantity, String countryOfOrigin) {
        this.id = id;
        this.wrongName = wrongName;
        this.price = price;
        this.quantity = quantity;
        this.countryOfOrigin = countryOfOrigin;
    }

    public Fruit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWrongName() {
        return wrongName;
    }

    public void setWrongName(String wrongName) {
        this.wrongName = wrongName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return id == fruit.id && Double.compare(price, fruit.price) == 0 && quantity == fruit.quantity && Objects.equals(wrongName, fruit.wrongName) && Objects.equals(countryOfOrigin, fruit.countryOfOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wrongName, price, quantity, countryOfOrigin);
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "id=" + id +
                ", name='" + wrongName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
