package ru.hzerr.fx.engine.core.interfaces;

import org.slf4j.Logger;

import java.io.Closeable;

public interface ILogProvider extends Closeable {

    Logger getLogger();
    IReadOnlyLoggingConfiguration getConfiguration();
}
