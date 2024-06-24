package service;

import entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == id) {
                return customer;
            }
        }
        throw new IllegalArgumentException("Customer with ID " + id + " not found");
    }

    private int number;

    public void removeCustomer(Customer customer) {
        if (customer == null) {
            System.out.println("No customer found");
        } else {
            customers.remove(customer);
        }
    }

    public void getCustomerByFirstname (String firstname) {
        for (Customer customer : customers) {
            if (customer.getFirstName().equals(firstname)) {
                System.out.println(customer);
            }
        }
    }

    public List<Customer> getAdultCustomer () {
        List<Customer> adults = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getAge() >= 18) {
                adults.add(customer);
            }
        }
        return adults;
    }
}