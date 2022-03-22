package com.example.demo.controller;

import com.example.demo.DTO.CustumerDTO;
import com.example.demo.entities.Address;
import com.example.demo.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
public class MyController {

  @GetMapping("/{custumerId}")
  @ResponseBody
  public CustumerDTO getCustumer(@PathVariable Long custumerId) {
    Customer customer = new Customer();
    Address address = new Address();

    CustumerDTO customerDTO = new CustumerDTO();
    customerDTO.setAddress(address.getAddress());
    customerDTO.setCountry(address.getCountry());
    customerDTO.setFullname(customer.getFirstName() + " " + customer.getLastName());
    customerDTO.setId(customer.getId());

    return customerDTO;

  }
}
