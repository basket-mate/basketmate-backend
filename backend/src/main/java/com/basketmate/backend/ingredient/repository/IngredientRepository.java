package com.basketmate.backend.ingredient.repository;

import com.basketmate.backend.ingredient.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {}
