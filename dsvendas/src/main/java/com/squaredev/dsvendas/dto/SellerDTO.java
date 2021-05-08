package com.squaredev.dsvendas.dto;

import java.io.Serializable;

import com.squaredev.dsvendas.entities.Seller;

// implementation allows it to be converted to bytes
public class SellerDTO implements Serializable{
  private Long id;
  private String name;
  
  public SellerDTO(Long id, String name) {
    this.id = id;
    this.name = name;
  }
  
  public SellerDTO(Seller entity) {
    id = entity.getId();
    name = entity.getName();
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
}
