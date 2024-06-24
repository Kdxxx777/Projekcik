package service;

import entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomer(int iddd) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == iddd) {
                return customer;
            }
        }
        throw new IllegalArgumentException("Customer with ID " + iddd + " not found");
    }

    private int number;

    public void removeCustomer(Customer customer) {
        if (customer == null) {
            System.out.println("No customer found");
        } else {
            customers.remove(customer);
        }
    }
}