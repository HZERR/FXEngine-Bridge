package ru.hzerr.fx.engine.core.interfaces.logging;

import org.slf4j.Logger;
import ru.hzerr.fx.engine.core.interfaces.configuration.IReadOnlyLoggingConfiguration;

import java.io.Closeable;

public interface ILogProvider extends Closeable {

    Logger getLogger();
    IReadOnlyLoggingConfiguration getConfiguration();
}
