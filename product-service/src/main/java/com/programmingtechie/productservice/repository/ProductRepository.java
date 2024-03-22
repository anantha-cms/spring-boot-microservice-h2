package com.programmingtechie.productservice.repository;

import com.programmingtechie.productservice.model.*;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository  extends JpaRepository<Product, Long> {
}
