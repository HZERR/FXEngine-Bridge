package ru.hzerr.fx.engine.core.interfaces.engine;

import ru.hzerr.file.BaseDirectory;
import ru.hzerr.file.BaseFile;
import ru.hzerr.fx.engine.core.annotation.Registered;
import ru.hzerr.fx.engine.core.interfaces.configuration.IReadOnlyConfiguration;

@Registered
public interface IStructureConfiguration extends IReadOnlyConfiguration {

    BaseDirectory getProgramDirectory();
    BaseDirectory getLogDirectory();
    BaseDirectory getConfigDirectory();
    BaseFile getSoftwareConfigurationFile();
}
