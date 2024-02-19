package com.taltou.customerservice.mappers;

import com.taltou.customerservice.dtos.CustomerRequestDTO;
import com.taltou.customerservice.dtos.CustomerResponseDTO;
import com.taltou.customerservice.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    private ModelMapper modelMapper=new ModelMapper();
    public CustomerResponseDTO from(Customer customer){
        return modelMapper.map(customer,CustomerResponseDTO.class);
    }
    public Customer from(CustomerRequestDTO customerRequestDTO){
        return modelMapper.map(customerRequestDTO,Customer.class);
    }
}
