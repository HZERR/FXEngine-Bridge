package ru.hzerr.fx.engine.core.interfaces.entity;

public interface ISpringLoadMetaData<C extends IController> {

    Class<C> getControllerClass();
    Object[] getArguments();
}
