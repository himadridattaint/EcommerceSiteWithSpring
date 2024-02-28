package com.INTStore.EcommerceSiteWithSpring.application.controller;

import com.INTStore.EcommerceSiteWithSpring.application.model.Customer;
import com.INTStore.EcommerceSiteWithSpring.application.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;
    @GetMapping("/all-customer")
    public List<Customer> getAllCustomers()
    {
        return customerService.getAllCustomer();
    }
    @PostMapping("/register-customer")
    public void saveNewCustomer(@RequestBody Customer customer) {
        customerService.saveNewCustomer(customer);
    }



}
