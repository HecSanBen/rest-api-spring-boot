package com.hector.dogcue.Controllers;

import java.util.ArrayList;

import com.hector.dogcue.models.CustomerModel;
import com.hector.dogcue.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerRetrieveDataController {

    @Autowired
    CustomerService customerService;

    @GetMapping()
    public ArrayList<CustomerModel> getAllCustomers() {
        return customerService.getAllCustomers();
    }

}
