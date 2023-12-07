package entity;

import java.util.Objects;

public class Drinks {

    private int id;
    private String name;
    private String producer;
    private double price;
    private boolean isExportedFromOtherOrigin;

    public Drinks(int id, String name, String producer, double price, boolean isExportedFromOtherOrigin) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.isExportedFromOtherOrigin = isExportedFromOtherOrigin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isExportedFromOtherOrigin() {
        return isExportedFromOtherOrigin;
    }

    public void setExportedFromOtherOrigin(boolean exportedFromOtherOrigin) {
        isExportedFromOtherOrigin = exportedFromOtherOrigin;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", isExportedFromOtherOrigin=" + isExportedFromOtherOrigin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drinks drinks = (Drinks) o;
        return id == drinks.id && Double.compare(price, drinks.price) == 0 && isExportedFromOtherOrigin == drinks.isExportedFromOtherOrigin && Objects.equals(name, drinks.name) && Objects.equals(producer, drinks.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, producer, price, isExportedFromOtherOrigin);
    }
}
