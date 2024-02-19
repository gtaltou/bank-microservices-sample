package com.taltou.customerservice.web;

import com.taltou.customerservice.entities.Customer;
import com.taltou.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataRestController {
    @Autowired

    private CustomerRepository customerRepository;
    @GetMapping("/customers")
    public List<Customer> listCustomers(){
        return customerRepository.findAll();
    }
    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
