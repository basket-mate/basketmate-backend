package com.basketmate.backend.product.entity;

import com.basketmate.backend.ingredient.entity.Ingredient;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private Long price;

    @Column(nullable = false)
    private String quantity;

    @Column(nullable = false)
    private String productDetail;

    @ManyToOne
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    // Getters and Setters
}

