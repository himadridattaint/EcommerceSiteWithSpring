package com.INTStore.EcommerceSiteWithSpring.application.controller;

import com.INTStore.EcommerceSiteWithSpring.application.model.Address;
import com.INTStore.EcommerceSiteWithSpring.application.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController
{
    @Autowired
    private AddressService addressService;
    @GetMapping("/all-address")
    public List<Address> getAllAddress()
    {
        return addressService.getAllAddresses();
    }
    @PostMapping("/register-address")
    public void saveNewAddress(@RequestBody Address address)
    {
        addressService.saveNewAddress(address);
    }


}
