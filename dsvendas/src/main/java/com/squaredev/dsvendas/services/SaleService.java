package com.squaredev.dsvendas.services;

import java.util.stream.Collectors;

import com.squaredev.dsvendas.dto.SaleDTO;
import com.squaredev.dsvendas.entities.Sale;
import com.squaredev.dsvendas.repositories.SaleRepository;
import com.squaredev.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
  
  @Autowired
  private SaleRepository repository;

  // bring related entity's intance to memory to optimize query 
  @Autowired 
  private SellerRepository sellerRepository;

  @Transactional( readOnly = true )
  public Page<SaleDTO> findAll(Pageable pageable) {
    sellerRepository.findAll();
    Page<Sale> result = repository.findAll(pageable);
    return result.map( Sale -> new SaleDTO(Sale));
  }
  
}
