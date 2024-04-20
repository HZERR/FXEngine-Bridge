package ru.hzerr.fx.engine.core.interfaces;

public interface IExtendedAnnotationConfigApplicationContextSequentialRegistrar extends IExtendedAnnotationConfigApplicationContextInitializer {

    void register(Class<? extends IExtendedAnnotationConfigApplicationContextInitializer> initializer);
}
