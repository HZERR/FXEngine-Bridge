package ru.hzerr.fx.engine.core.annotation.metadata;

import ru.hzerr.fx.engine.core.annotation.MetaData;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static ru.hzerr.fx.engine.core.annotation.MetaData.APPLICATION_LOG_PROVIDER;

@MetaData(APPLICATION_LOG_PROVIDER)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationLogProvider {
}
