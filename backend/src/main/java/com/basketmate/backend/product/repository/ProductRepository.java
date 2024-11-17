package com.basketmate.backend.product.repository;

import com.basketmate.backend.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, String> {

    @Query("SELECT p FROM Product p WHERE p.mainCategory = :mainCategory AND p.subCategory = :subCategory ORDER BY p.price ASC")
    Page<Product> findProductsByCategoriesOrderByPrice(String mainCategory, String subCategory, Pageable pageable);

    @Query("SELECT p FROM Product p WHERE p.mainCategory = :mainCategory AND p.subCategory = :subCategory ORDER BY p.reviewCount DESC")
    Page<Product> findProductsByCategoriesOrderByReviewCount(String mainCategory, String subCategory, Pageable pageable);

    @Query("SELECT p FROM Product p WHERE p.mainCategory = :mainCategory AND p.subCategory = :subCategory ORDER BY p.rating DESC")
    Page<Product> findProductsByCategoriesOrderByRating(String mainCategory, String subCategory, Pageable pageable);
}