package com.example.stringbootws.repository;

import com.example.stringbootws.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
