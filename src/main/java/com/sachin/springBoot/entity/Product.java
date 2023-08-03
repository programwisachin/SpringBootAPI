package com.sachin.springBoot.entity;

import com.sachin.springBoot.dto.CustomerType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Product {
    @Id
    private Integer productId;
    private String productDescription;
    private String productName;
    private LocalDate ExpiryDate;
    public Integer getCustomerId() {
        return productId;
    }
    public void setCustomerId(Integer productId) {
        this.productId = productId;
    }
    public String getproductDescription() {
        return productDescription;
    }
    public void setproductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public String getName() {
        return productName;
    }
    public void setName(String productName) {
        this.productName = productName;
    }
    public LocalDate getExpiryDate() {
        return ExpiryDate;
    }
    public void setExpiryDate(LocalDate ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }


    @Override
    public String toString() {
        return "Customer [productId=" + productId + ", productDescription=" + productDescription + ", productName=" + productName + ", ExpiryDate="
                + ExpiryDate +  "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getCustomerId() == null) ? 0 : this.getCustomerId().hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (this.getCustomerId() == null) {
            if (other.getCustomerId() != null)
                return false;
        }
        else if (!this.getCustomerId().equals(other.getCustomerId()))
            return false;
        return true;
    }

}