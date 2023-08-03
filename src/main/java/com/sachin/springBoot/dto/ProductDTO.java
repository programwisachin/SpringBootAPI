package com.sachin.springBoot.dto;

import java.time.LocalDate;

public class ProductDTO {
    private Integer productId;
    private String productDescription;
    private String productName;
    private LocalDate ExpiryDate;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        ExpiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productId=" + productId +
                ", productDescription='" + productDescription + '\'' +
                ", productName='" + productName + '\'' +
                ", ExpiryDate=" + ExpiryDate +
                '}';
    }

}