package com.a608.ddobagi.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserQuiz is a Querydsl query type for UserQuiz
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserQuiz extends EntityPathBase<UserQuiz> {

    private static final long serialVersionUID = -1701683875L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserQuiz userQuiz = new QUserQuiz("userQuiz");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isFirstCorrected = createBoolean("isFirstCorrected");

    public final BooleanPath isNowCorrected = createBoolean("isNowCorrected");

    public final QQuiz quiz;

    public final QUser user;

    public QUserQuiz(String variable) {
        this(UserQuiz.class, forVariable(variable), INITS);
    }

    public QUserQuiz(Path<? extends UserQuiz> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserQuiz(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserQuiz(PathMetadata metadata, PathInits inits) {
        this(UserQuiz.class, metadata, inits);
    }

    public QUserQuiz(Class<? extends UserQuiz> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.quiz = inits.isInitialized("quiz") ? new QQuiz(forProperty("quiz"), inits.get("quiz")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

