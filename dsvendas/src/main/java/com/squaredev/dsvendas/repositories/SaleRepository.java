package com.squaredev.dsvendas.repositories;

import com.squaredev.dsvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Long> {
  
}
