package ru.hzerr.fx.engine.core.interfaces;

public interface ILocalizationProvider<T extends ILocalization> {

    T getLocalization();
}
