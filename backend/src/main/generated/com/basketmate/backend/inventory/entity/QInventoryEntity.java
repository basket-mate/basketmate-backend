package com.basketmate.backend.inventory.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QInventoryEntity is a Querydsl query type for InventoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInventoryEntity extends EntityPathBase<InventoryEntity> {

    private static final long serialVersionUID = -12611082L;

    public static final QInventoryEntity inventoryEntity = new QInventoryEntity("inventoryEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> price = createNumber("price", Double.class);

    public final StringPath productName = createString("productName");

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public QInventoryEntity(String variable) {
        super(InventoryEntity.class, forVariable(variable));
    }

    public QInventoryEntity(Path<? extends InventoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInventoryEntity(PathMetadata metadata) {
        super(InventoryEntity.class, metadata);
    }

}

