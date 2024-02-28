package com.INTStore.EcommerceSiteWithSpring.application.service;

import com.INTStore.EcommerceSiteWithSpring.application.model.Address;
import com.INTStore.EcommerceSiteWithSpring.application.model.Customer;
import com.INTStore.EcommerceSiteWithSpring.application.repository.AddressRepository;
import com.INTStore.EcommerceSiteWithSpring.application.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService
{
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AddressRepository addressRepository;
    public List<Customer> getAllCustomer()
    {
        return customerRepository.findAll();
    }
    public void saveNewCustomer(Customer customer)
    {
        customerRepository.save(customer);
    }

}
