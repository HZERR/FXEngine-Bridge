package ru.hzerr.fx.engine.core.annotation.metadata;

import ru.hzerr.fx.engine.core.annotation.MetaData;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static ru.hzerr.fx.engine.core.annotation.MetaData.APPLICATION_LOGGING_LOCALIZATION_META_DATA;

@MetaData(APPLICATION_LOGGING_LOCALIZATION_META_DATA)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationLoggingLocalizationMetaData {
}
