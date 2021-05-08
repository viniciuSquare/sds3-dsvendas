package com.squaredev.dsvendas.repositories;

import java.util.List;

import com.squaredev.dsvendas.dto.SaleSumDTO;
import com.squaredev.dsvendas.dto.SalesSuccessDTO;
import com.squaredev.dsvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long> {

  @Query("SELECT new com.squaredev.dsvendas.dto.SaleSumDTO( obj.seller, SUM(obj.amount) )  FROM Sale AS obj GROUP BY obj.seller")
  List<SaleSumDTO> amountGroupedBySeller();
  
  @Query("SELECT new com.squaredev.dsvendas.dto.SalesSuccessDTO( obj.seller, SUM(obj.visited), SUM(obj.deals) )  FROM Sale AS obj GROUP BY obj.seller")
  List<SalesSuccessDTO> successGroupedBySeller();

}
