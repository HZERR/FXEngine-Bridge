package ru.hzerr.fx.engine.core.annotation.as;

import ru.hzerr.fx.engine.core.annotation.IncludeAs;

import java.lang.annotation.*;

@IncludeAs("applicationLogProvider")
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationLogProvider {
    /**
     * Declares whether the annotated dependency is required.
     * <p>Defaults to {@code true}.
     */
    boolean required() default true;
}
