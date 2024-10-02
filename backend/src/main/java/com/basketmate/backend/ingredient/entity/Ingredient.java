package com.basketmate.backend.ingredient.entity;

import javax.persistence.*;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ingredientId;

    @Column(nullable = false)
    private String ingredientName;

    @Column(nullable = false)
    private String category;

    // Getters and Setters
}
