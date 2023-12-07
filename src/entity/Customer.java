package entity;

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
}
