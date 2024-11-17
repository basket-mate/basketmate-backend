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

    @Column(name = "product_name", nullable = false, length = 255)
    private String productName;

    @Column(name = "class_name", nullable = false, length = 255)
    private String className;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "rating", length = 10)
    private String rating;

    @Column(name = "review_count")
    private Integer reviewCount;

    @Column(name = "main_category", length = 50)
    private String mainCategory;

    @Column(name = "sub_category", length = 50)
    private String subCategory;

    @Column(name = "img_url", length = 255)
    private String imgUrl;

    @Column(name = "size", length = 500)
    private String size;

    @Column(name = "producer", columnDefinition = "TEXT")
    private String producer;

    @Column(name = "importer", columnDefinition = "TEXT")
    private String importer;

    @Column(name = "origin", columnDefinition = "TEXT")
    private String origin;

    @Column(name = "expiration", columnDefinition = "TEXT")
    private String expiration;
}
