package ru.hzerr.fx.engine.core.annotation.metadata;

import ru.hzerr.fx.engine.core.annotation.MetaData;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static ru.hzerr.fx.engine.core.annotation.MetaData.ENGINE_LOGGING_LOCALIZATION_PROVIDER;

@MetaData(ENGINE_LOGGING_LOCALIZATION_PROVIDER)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface EngineLoggingLocalizationProvider {
}
