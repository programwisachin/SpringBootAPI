package com.sachin.springBoot.service;



import com.sachin.springBoot.Exception.HnDBankException;
import com.sachin.springBoot.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    public int addProduct(ProductDTO customer) throws HnDBankException;
    public ProductDTO getProduct(Integer customerId) throws HnDBankException;
    public List<ProductDTO> findAll() throws HnDBankException;
    public void updateProduct(Integer customerId, ProductDTO customerDTO) throws HnDBankException;
    public void deleteProduct(Integer customerId)throws HnDBankException;


//    void findBy(String emailId, int custId) throws HnDBankException;
}