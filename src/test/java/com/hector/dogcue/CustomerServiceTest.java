package com.hector.dogcue;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.hector.dogcue.models.CustomerModel;
import com.hector.dogcue.repositories.CustomerRepository;
import com.hector.dogcue.services.CustomerService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    private CustomerService service;

    @MockBean
    private CustomerRepository repository;

    @Test
    @DisplayName("Test get all customers")
    public void testGetAllCustomers() throws Exception {
        when(repository.findAll()).thenReturn(Stream.of(new CustomerModel(1L, "a@gmail.com", "a", "a"),
                new CustomerModel(2L, "a@gmail.com", "a", "a"), new CustomerModel(3L, "a@gmail.com", "a", "a"),
                new CustomerModel(4L, "a@gmail.com", "a", "a"), new CustomerModel(5L, "a@gmail.com", "a", "a"))
                .collect(Collectors.toList()));
        assertEquals(5, service.getAllCustomers().size());
    }

    @Test
    @DisplayName("Test save customer")
    public void testSaveCustomer() throws Exception {
        CustomerModel customer = new CustomerModel(99L, "bbbb@gmail.com", "bbbb", "bbbb");
        when(repository.save(customer)).thenReturn(customer);
        assertEquals(customer, service.saveCustomer(customer));
    }
}
