package ru.hzerr.fx.engine.core.interfaces.localization;

import com.typesafe.config.ConfigSyntax;
import ru.hzerr.fx.engine.core.interfaces.path.ILocation;

import java.util.Locale;

public interface ILocalizationMetaData {

    Locale getLocale();
    ILocation getILocation();
    ConfigSyntax getSyntax();
}
