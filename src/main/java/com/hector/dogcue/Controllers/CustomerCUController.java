package com.hector.dogcue.Controllers;

import com.hector.dogcue.models.CustomerModel;
import com.hector.dogcue.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerCUController {

    @Autowired
    CustomerService customerService;

    @PostMapping()
    public CustomerModel saveCustomer(@RequestBody CustomerModel customer) {
        return this.customerService.saveCustomer(customer);
    }
}
