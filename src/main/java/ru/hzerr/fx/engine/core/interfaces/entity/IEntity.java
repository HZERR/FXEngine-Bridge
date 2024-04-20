package ru.hzerr.fx.engine.core.interfaces.entity;

public interface IEntity<C, N> {

    C getController();
    N getNode();
}
