package com.basketmate.backend.user.repository;

import com.basketmate.backend.user.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}

