package entity;

import java.util.Objects;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastNameeee;
    private String address;
    private int age;
    private double discount;

    Customer(int customerId, String nickName, String address, int age, double discount){
        String[] split = nickName.split(".");
        this.firstName = split[0];
        this.lastNameeee = split[1];
        this.customerId = customerId;
        this.address = address;
        this.age = age;
        this.discount = discount;
    }

    public Customer(int customerId, String firstName, String lastName, String address, int age, double discount) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastNameeee = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastNameeee;
    }

    public void setLastName(String lastName) {
        this.lastNameeee = lastName;
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
        return customerId == customer.customerId && age == customer.age && Double.compare(discount, customer.discount) == 0 && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastNameeee, address, age, discount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastNameeee + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", discount=" + discount +
                '}';
    }
}
