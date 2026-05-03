package com.ss15.Ex1.repository;

import com.ss15.Ex3.Ex1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryAndPriceLessThanEqualAndStockQuantityGreaterThan(String category, Double maxPrice, Integer minStock);
}