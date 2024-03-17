package entity;

import java.util.Objects;
import java.util.UUID;

import java.util.UUID;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private double discount;
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    Customer( String nickName, String address, int age, double discount){
        String[] split = nickName.split(".");
        this.firstName = split[0];
        this.lastName = split[1];
        this.address = address;
        this.age = age;
        this.discount = discount;
        this.customerId = UUID.randomUUID().toString();
    }

    public Customer(String firstName, String lastName, String address, int age, double discount) {
        this.customerId = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && age == customer.age && Double.compare(discount, customer.discount)
                == 0  && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, address, age, discount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", discount=" + discount +
                '}';
    }
}
