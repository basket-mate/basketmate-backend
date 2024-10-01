package com.basketmate.backend.user.repository;

import com.basketmate.backend.user.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {}

