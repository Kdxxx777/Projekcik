package entity;

import java.util.Map;
import java.util.Objects;

public class Order {

    private int orderId;
    private int customerId;  // Możesz dodać pole Customer, jeśli masz taką klasę
    private Map<Integer, Integer> orderedItems;  // Mapa id warzywa i ilości w zamówieniu
    private double totalAmount;

    public Order(int orderId, int customerId, Map<Integer, Integer> orderedItems, double totalAmount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderedItems = orderedItems;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Map<Integer, Integer> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(Map<Integer, Integer> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", orderedItems=" + orderedItems +
                ", totalAmount=" + totalAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && customerId == order.customerId && Double.compare(totalAmount, order.totalAmount) == 0 && Objects.equals(orderedItems, order.orderedItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, customerId, orderedItems, totalAmount);
    }
}
