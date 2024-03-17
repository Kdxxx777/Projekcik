package service;

import entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public Customer getCustomer(String customerId){
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId){
                return customer;
            }
        }
        throw new IllegalArgumentException("Customer with ID " + customerId + " not found");
    }
}
