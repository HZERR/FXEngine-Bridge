package ru.hzerr.fx.engine.core.interfaces.engine;

import ru.hzerr.fx.engine.core.interfaces.configuration.ILoggingConfiguration;

public interface ISoftwareConfiguration {

    ILoggingConfiguration getLoggingConfiguration();
    IApplicationConfiguration getApplicationConfiguration();
}
