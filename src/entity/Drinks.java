package entity;

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
}
