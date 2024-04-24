package ru.hzerr.fx.engine.core.annotation.as;

import ru.hzerr.fx.engine.core.annotation.IncludeAs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IncludeAs("engineLogProvider")
@Retention(RetentionPolicy.RUNTIME)
public @interface EngineLogProvider {
    /**
     * Declares whether the annotated dependency is required.
     * <p>Defaults to {@code true}.
     */
    boolean required() default true;
}
