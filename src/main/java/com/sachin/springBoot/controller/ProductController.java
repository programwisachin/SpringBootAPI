package com.sachin.springBoot.controller;

import com.sachin.springBoot.Exception.HnDBankException;
import com.sachin.springBoot.dto.ProductDTO;
import com.sachin.springBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hndbank")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private Environment environment;
    @GetMapping(value = "/products")
    public ResponseEntity<List<ProductDTO>> getAllProducts() throws HnDBankException {
        List<ProductDTO> productList = productService.findAll();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
    @GetMapping(value = "/products/{productId}")
    public ProductDTO getProduct(@PathVariable Integer productId) throws HnDBankException {
        ProductDTO product = productService.getProduct(productId);
        return product;
    }
    @GetMapping(value = "/product")
    public ResponseEntity<ProductDTO> getProductParam(@RequestParam Integer productId) throws HnDBankException {
        ProductDTO product = productService.getProduct(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    @PostMapping(value = "/products")
    public ResponseEntity<String> addProduct(@RequestBody  ProductDTO product) throws HnDBankException {
        Integer productId = productService.addProduct(product);
        String successMessage = environment.getProperty("API.INSERT_SUCCESS") + productId;
        return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
    }
    @PutMapping(value = "/products/{productId}")
    public ResponseEntity<String> updateProduct(@PathVariable Integer productId, @RequestBody ProductDTO product)
            throws HnDBankException {
        productService.updateProduct(productId,product);
        String successMessage = environment.getProperty("API.UPDATE_SUCCESS");
        return new ResponseEntity<>(successMessage, HttpStatus.OK);
    }
    @DeleteMapping(value = "/products/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable Integer productId) throws HnDBankException {
        productService.deleteProduct(productId);
        String successMessage = environment.getProperty("API.DELETE_SUCCESS");
        return new ResponseEntity<>(successMessage, HttpStatus.OK);
    }

}