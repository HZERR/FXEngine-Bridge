package ru.hzerr.fx.engine.core.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MetaData {

    String value() default "";

    String ENGINE_LOGGING_LOCALIZATION_PROVIDER = "engineLoggingLocalizationProvider";
    String APPLICATION_LOGGING_LOCALIZATION_PROVIDER = "applicationLoggingLocalizationProvider";
    String ENGINE_LOG_PROVIDER = "engineLogProvider";
    String APPLICATION_LOG_PROVIDER = "applicationLogProvider";
    String APPLICATION_LOGGING_LOCALIZATION_META_DATA = "applicationLoggingLocalizationMetaData";
}
