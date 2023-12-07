package entity;

public class Customer {
    private int customerId;
    private String nazwaUzytkownika;
    private String adresZamieszkania;
    private int age;

    public Customer(int customerId, String nickName, String address, int age) {
        this.customerId = customerId;
        this.nazwaUzytkownika = nickName;
        this.adresZamieszkania = address;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getNazwaUzytkownika() {
        return nazwaUzytkownika;
    }

    public void setNazwaUzytkownika(String nazwaUzytkownika) {
        this.nazwaUzytkownika = nazwaUzytkownika;
    }

    public String getAdresZamieszkania() {
        return adresZamieszkania;
    }

    public void setAdresZamieszkania(String adresZamieszkania) {
        this.adresZamieszkania = adresZamieszkania;
    }
}
