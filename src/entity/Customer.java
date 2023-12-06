package entity;

public class Customer {
    private int customerId;
    private String nickName;
    private String address;

    public Customer(int customerId, String nickName, String address) {
        this.customerId = customerId;
        this.nickName = nickName;
        this.address = address;
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
}
