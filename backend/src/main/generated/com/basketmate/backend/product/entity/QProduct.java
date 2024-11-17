package com.basketmate.backend.product.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = -898481773L;

    public static final QProduct product = new QProduct("product");

    public final StringPath className = createString("className");

    public final StringPath expiration = createString("expiration");

    public final StringPath imgUrl = createString("imgUrl");

    public final StringPath importer = createString("importer");

    public final StringPath mainCategory = createString("mainCategory");

    public final StringPath origin = createString("origin");

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final StringPath producer = createString("producer");

    public final StringPath productId = createString("productId");

    public final StringPath productName = createString("productName");

    public final StringPath rating = createString("rating");

    public final NumberPath<Integer> reviewCount = createNumber("reviewCount", Integer.class);

    public final StringPath size = createString("size");

    public final StringPath subCategory = createString("subCategory");

    public QProduct(String variable) {
        super(Product.class, forVariable(variable));
    }

    public QProduct(Path<? extends Product> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduct(PathMetadata metadata) {
        super(Product.class, metadata);
    }

}

