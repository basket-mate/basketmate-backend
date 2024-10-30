package com.basketmate.backend.product.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_id", nullable = false, unique = true)
    private String productId;

    private String productName;
    private String className;
    private BigDecimal price;
    private String rating;
    private Integer reviewCount;
    private String mainCategory;
    private String subCategory;
    private String imgUrl;
    private String size;
    private String producer;
    private String importer;
    private String origin;
    private String expiration;
}