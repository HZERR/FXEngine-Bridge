package ru.hzerr.fx.engine.core.interfaces;

import org.springframework.context.ApplicationContext;

public interface IApplicationContextProvider<T extends ApplicationContext> {

    T getContext();
}
