package com.squaredev.dsvendas.repositories;

import com.squaredev.dsvendas.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller,Long> {
  
}
