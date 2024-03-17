package entity;

import java.util.UUID;

public class Customer {
    private String customerId;
    private String nickName;
    private String address;
    private int age;
    private double discount;
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Customer(){};

    public Customer( String nickName, String address, int age, double discount, String phoneNumber) {
        this.customerId = UUID.randomUUID().toString();
        this.nickName = nickName;
        this.address = address;
        this.age = age;
        this.discount = discount;
        this.phoneNumber = phoneNumber;
    }

    public Customer(String nickName, String address, int age, double discount) {
        this.customerId = UUID.randomUUID().toString();
        this.nickName = nickName;
        this.address = address;
        this.age = age;
        this.discount = discount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setId(String customerId) {
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
}
