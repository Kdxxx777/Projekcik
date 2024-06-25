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

    public void printCustomerByFirstName(String firstName) {
        if (firstName == null) {
            throw new NullPointerException("Provided firstName is null");
        }
        for (Customer customer : customers) {
            if (customer.getFirstName().equals(firstName)) {
                System.out.println(customer);
            }
        }
    }

    public List<Customer> getAdultCustomers() {
        List<Customer> adults = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getAge() >= 18) {
                adults.add(customer);
            }
        }
        if (adults.isEmpty()) {
            throw new IllegalStateException("No adults found.");
        }
        return adults;
    }
}