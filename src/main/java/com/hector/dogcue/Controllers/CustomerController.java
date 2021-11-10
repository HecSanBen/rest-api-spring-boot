package com.hector.dogcue.Controllers;

import java.util.ArrayList;

import com.hector.dogcue.models.CustomerModel;
import com.hector.dogcue.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping()
    public ArrayList<CustomerModel> getCustomer() {
        return customerService.getAllCustomers();
    }

    @PostMapping()
    public CustomerModel saveCustomer(@RequestBody CustomerModel customer) {
        return this.customerService.saveCustomer(customer);
    }

}
