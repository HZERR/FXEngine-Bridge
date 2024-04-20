package ru.hzerr.fx.engine.core.interfaces.engine;

import org.jetbrains.annotations.Nullable;
import ru.hzerr.fx.engine.core.interfaces.configuration.IReadOnlyConfiguration;
import ru.hzerr.fx.engine.core.interfaces.path.ILocation;

public interface IResourceStructureConfiguration extends IReadOnlyConfiguration {

    @Nullable ILocation getFXMLPackage();
    @Nullable ILocation getThemePackage();

    @Nullable ILocation getApplicationInternationalizationPackage();
    @Nullable ILocation getApplicationLoggingInternationalizationPackage();
}
