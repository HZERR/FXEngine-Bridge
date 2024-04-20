package ru.hzerr.fx.engine.core.interfaces.context;

import org.springframework.beans.factory.InitializingBean;
import ru.hzerr.fx.engine.core.exception.ApplicationContextInitializationException;

public interface IExtendedAnnotationConfigApplicationContextInitializer extends InitializingBean {

    @Override
    default void afterPropertiesSet() {
        onInitialize();
    }

    void onInitialize() throws ApplicationContextInitializationException;
}
