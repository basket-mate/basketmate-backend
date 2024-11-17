package com.basketmate.backend.product.controller;

import com.basketmate.backend.product.entity.Product;
import com.basketmate.backend.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/recommend")
    public Page<Product> getRecommendedProducts(
            @RequestParam String sortOption,
            @RequestParam String mainCategory,
            @RequestParam String subCategory,
            @RequestParam(defaultValue = "0") int page) {
        return productService.getRecommendedProducts(sortOption, mainCategory, subCategory, page);
    }
}
