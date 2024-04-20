package ru.hzerr.fx.engine.core.interfaces;

import org.jetbrains.annotations.Nullable;

public interface IResourceStructureConfiguration extends IReadOnlyConfiguration {

    @Nullable ILocation getFXMLPackage();
    @Nullable ILocation getThemePackage();

    @Nullable ILocation getApplicationInternationalizationPackage();
    @Nullable ILocation getApplicationLoggingInternationalizationPackage();
}
