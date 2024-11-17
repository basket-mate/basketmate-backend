package com.basketmate.backend.product.service;

import com.basketmate.backend.product.entity.Product;
import com.basketmate.backend.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Page<Product> getRecommendedProducts(String sortOption, String mainCategory, String subCategory, int page) {
        Pageable pageable = PageRequest.of(page, 10);

        switch (sortOption) {
            case "lowPrice":
                return productRepository.findProductsByCategoriesOrderByPrice(mainCategory, subCategory, pageable);
            case "mostReviewed":
                return productRepository.findProductsByCategoriesOrderByReviewCount(mainCategory, subCategory, pageable);
            case "bestSelling":
                return productRepository.findProductsByCategoriesOrderByRating(mainCategory, subCategory, pageable);
            default:
                throw new IllegalArgumentException("Invalid sort option");
        }
    }
}
