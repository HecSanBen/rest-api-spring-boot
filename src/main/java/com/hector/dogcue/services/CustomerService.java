package com.hector.dogcue.services;

import java.util.ArrayList;

import com.hector.dogcue.models.CustomerModel;
import com.hector.dogcue.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public ArrayList<CustomerModel> getAllCustomers() {
        return (ArrayList<CustomerModel>) customerRepository.findAll();
    }

    public CustomerModel saveCustomer(CustomerModel customer) {
        return customerRepository.save(customer);
    }
}
