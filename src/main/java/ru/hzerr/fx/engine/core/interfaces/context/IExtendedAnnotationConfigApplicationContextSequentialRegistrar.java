package ru.hzerr.fx.engine.core.interfaces.context;

public interface IExtendedAnnotationConfigApplicationContextSequentialRegistrar extends IExtendedAnnotationConfigApplicationContextInitializer {

    void register(Class<? extends IExtendedAnnotationConfigApplicationContextInitializer> initializer);
}
