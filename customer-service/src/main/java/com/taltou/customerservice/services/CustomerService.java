package com.taltou.customerservice.services;

import com.taltou.customerservice.dtos.CustomerRequestDTO;
import com.taltou.customerservice.dtos.CustomerResponseDTO;
import com.taltou.customerservice.exceptions.CustomerNotFoundException;
import com.taltou.customerservice.exceptions.EmailAlreadyUsedException;

import java.util.List;

public interface CustomerService {
    CustomerResponseDTO save(CustomerRequestDTO request) throws EmailAlreadyUsedException;
    List<CustomerResponseDTO> listCustomers();
    CustomerResponseDTO getCustomerById(Long id) throws CustomerNotFoundException;
    CustomerResponseDTO update(CustomerRequestDTO requestDTO) throws CustomerNotFoundException, EmailAlreadyUsedException;
    void deleteCustomer(Long id) throws CustomerNotFoundException;
    List<CustomerResponseDTO> findCustomers(String keyWord);
}
