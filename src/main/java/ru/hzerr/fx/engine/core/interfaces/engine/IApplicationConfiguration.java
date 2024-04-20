package ru.hzerr.fx.engine.core.interfaces.engine;

import java.util.Locale;

public interface IApplicationConfiguration {

    Locale getLocale();
    void setLocale(Locale locale);

    String getThemeName();
    void setThemeName(String themeName);
}
