package com.sachin.springBoot.service;



import com.sachin.springBoot.Exception.HnDBankException;
import com.sachin.springBoot.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    public int addCustomer(CustomerDTO customer) throws HnDBankException;
    public CustomerDTO getCustomer(Integer customerId) throws HnDBankException;
    public List<CustomerDTO> findAll() throws HnDBankException;
    public void updateCustomer(Integer customerId, CustomerDTO customerDTO) throws HnDBankException;
    public void deleteCustomer(Integer customerId)throws HnDBankException;


//    void findBy(String emailId, int custId) throws HnDBankException;
}