package ru.hzerr.fx.engine.core.interfaces.localization;

public interface ILocalizationProvider<T extends ILocalization> {

    T getLocalization();
}
