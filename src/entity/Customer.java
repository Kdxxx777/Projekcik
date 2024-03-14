package entity;

import java.util.Objects;

public class Customer {
    private int customerId;
    private String nickName;
    private String address;
    private int age;
    private double discount;

    public Customer(int customerId, String nickName, String address, int age, double discount) {
        this.customerId = customerId;
        this.nickName = nickName;
        this.address = address;
        this.age = age;
        this.discount = discount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", nickName='" + nickName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", discount=" + discount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && age == customer.age && Double.compare(discount, customer.discount) == 0 && Objects.equals(nickName, customer.nickName) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, nickName, address, age, discount);
    }
}
