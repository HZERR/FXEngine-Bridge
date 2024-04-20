package ru.hzerr.fx.engine.core.interfaces;

import com.typesafe.config.ConfigSyntax;

import java.util.Locale;

public interface ILocalizationMetaData {

    Locale getLocale();
    ILocation getILocation();
    ConfigSyntax getSyntax();
}
