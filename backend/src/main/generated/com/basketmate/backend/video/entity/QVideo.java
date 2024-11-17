package com.basketmate.backend.video.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QVideo is a Querydsl query type for Video
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QVideo extends EntityPathBase<Video> {

    private static final long serialVersionUID = 1041381907L;

    public static final QVideo video = new QVideo("video");

    public final StringPath dishName = createString("dishName");

    public final StringPath ingredient = createString("ingredient");

    public final StringPath recipe = createString("recipe");

    public final StringPath title = createString("title");

    public final StringPath videoId = createString("videoId");

    public QVideo(String variable) {
        super(Video.class, forVariable(variable));
    }

    public QVideo(Path<? extends Video> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVideo(PathMetadata metadata) {
        super(Video.class, metadata);
    }

}

