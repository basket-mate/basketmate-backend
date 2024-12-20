package com.basketmate.backend.history.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHistory is a Querydsl query type for History
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHistory extends EntityPathBase<History> {

    private static final long serialVersionUID = 1847943923L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHistory history = new QHistory("history");

    public final NumberPath<Long> historyId = createNumber("historyId", Long.class);

    public final com.basketmate.backend.product.entity.QProduct product;

    public final com.basketmate.backend.user.entity.QUserEntity user;

    public final com.basketmate.backend.video.entity.QVideo video;

    public QHistory(String variable) {
        this(History.class, forVariable(variable), INITS);
    }

    public QHistory(Path<? extends History> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHistory(PathMetadata metadata, PathInits inits) {
        this(History.class, metadata, inits);
    }

    public QHistory(Class<? extends History> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new com.basketmate.backend.product.entity.QProduct(forProperty("product")) : null;
        this.user = inits.isInitialized("user") ? new com.basketmate.backend.user.entity.QUserEntity(forProperty("user")) : null;
        this.video = inits.isInitialized("video") ? new com.basketmate.backend.video.entity.QVideo(forProperty("video")) : null;
    }

}

