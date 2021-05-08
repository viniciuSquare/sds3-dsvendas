package com.squaredev.dsvendas.controllers;

import java.util.List;

import com.squaredev.dsvendas.dto.SaleDTO;
import com.squaredev.dsvendas.dto.SaleSumDTO;
import com.squaredev.dsvendas.dto.SalesSuccessDTO;
import com.squaredev.dsvendas.services.SaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
  
  @Autowired
  private SaleService service;

  @GetMapping // paged search 
  public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
    Page<SaleDTO> list = service.findAll(pageable);
    
    return ResponseEntity.ok(list);
  }
 
  @GetMapping("/amount-by-seller")
  public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
    List<SaleSumDTO> list = service.amountGroupedBySeller();
    
    return ResponseEntity.ok(list); 
  }

  @GetMapping("/success-by-seller")
  public ResponseEntity<List<SalesSuccessDTO>> successGroupedBySeller(){
    List<SalesSuccessDTO> list = service.successGroupedBySeller();
    
    return ResponseEntity.ok(list); 
  }

}
