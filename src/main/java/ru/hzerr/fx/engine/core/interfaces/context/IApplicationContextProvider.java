package ru.hzerr.fx.engine.core.interfaces.context;

import org.springframework.context.ApplicationContext;

public interface IApplicationContextProvider<T extends ApplicationContext> {

    T getContext();
}
