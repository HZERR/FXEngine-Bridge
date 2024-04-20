package ru.hzerr.fx.engine.core.interfaces.engine;

import ru.hzerr.fx.engine.core.exception.LoadThemeException;
import ru.hzerr.fx.engine.core.interfaces.entity.IController;

import java.util.Locale;

public interface IApplicationManager {

    <C extends IController>
    void register(String id, C controller);

    void unregister(String id);

    void changeLanguage(Locale locale);

    void changeTheme(Class<? extends ThemeMetaData> themeMetaDataClass) throws LoadThemeException;

    void changeTheme(String themeName) throws LoadThemeException;

    <C extends IController>
    void applyTheme(C controller) throws LoadThemeException;

    ThemeMetaData getThemeMetaData();
}
