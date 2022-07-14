package com.foxsoftware.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foxsoftware.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
