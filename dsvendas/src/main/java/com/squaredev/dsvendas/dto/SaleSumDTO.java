package com.squaredev.dsvendas.dto;

import java.io.Serializable;

import com.squaredev.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
  private String sellerName;
  private Double sum;

  public SaleSumDTO() {
    
  }

  public SaleSumDTO(Seller entity, Double amount) {
    sellerName = entity.getName();
    sum = amount;
  }

  public String getSellerName() {
    return sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }

  public Double getSum() {
    return sum;
  }

  public void setSum(Double sum) {
    this.sum = sum;
  }
  
}
