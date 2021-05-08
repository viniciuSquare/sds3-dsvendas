package com.squaredev.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.squaredev.dsvendas.dto.SellerDTO;
import com.squaredev.dsvendas.entities.Seller;
import com.squaredev.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
  
  @Autowired
  private SellerRepository repository;

  public List<SellerDTO> findAll() {
    
    List<Seller> result = repository.findAll();
    return result.stream().map( seller -> new SellerDTO(seller)).collect(Collectors.toList());
  }
  
}
