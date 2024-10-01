package com.basketmate.backend.user.entity;

import javax.persistence.*;

@Entity
public class Video {
    @Id
    private String videoId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String dishName;

    @Column(nullable = false)
    private String recipe;

    @ManyToOne
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    // Getters and Setters
}
