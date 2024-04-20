package ru.hzerr.fx.engine.core.interfaces.context;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinitionCustomizer;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigRegistry;
import org.springframework.core.io.ResourceLoader;
import org.springframework.lang.Nullable;
import ru.hzerr.collections.list.HList;
import ru.hzerr.fx.engine.core.interfaces.logging.ILogProvider;
import ru.hzerr.fx.engine.core.interfaces.configuration.IReadOnlyLoggingConfiguration;
import ru.hzerr.fx.engine.core.interfaces.engine.*;
import ru.hzerr.fx.engine.core.interfaces.localization.IApplicationLoggingLocalizationProvider;
import ru.hzerr.fx.engine.core.interfaces.localization.IEngineLoggingLocalizationProvider;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface IExtendedAnnotationConfigApplicationContext extends AnnotationConfigRegistry, BeanDefinitionRegistry, ConfigurableApplicationContext, ResourceLoader {

    // BEGIN FLAT
    IReadOnlyLoggingConfiguration getLoggingConfiguration();
    IClassLoaderProvider getClassLoaderProvider();
    IEntityLoader getEntityLoader();
    IStructureConfiguration getStructureConfiguration();
    <T extends IStructureConfiguration> T getStructureConfigurationAs(Class<T> type);
    IResourceStructureConfiguration getResourceStructureConfiguration();
    <T extends IResourceStructureConfiguration> T getResourceStructureConfigurationAs(Class<T> type);
    ILogProvider getFXEngineLogProvider();
    ILogProvider getApplicationLogProvider();
    ISoftwareConfiguration getSoftwareConfiguration();
    IApplicationConfiguration getApplicationConfiguration();
    IApplicationLoggingLocalizationProvider getApplicationLoggingLocalizationProvider();
    IEngineLoggingLocalizationProvider getEngineLoggingLocalizationProvider();
    // END FLAT

    // BEGIN НА ПЕРЕСМОТРЕ
    IApplicationManager getApplicationManager();
    IFXEnvironment getFXEnvironment();
    HList<String> getScannedPackages();
    // END НА ПЕРЕСМОТРЕ

    // BEGIN EXTENDED METHOD CONTEXT
    <T> T registerAndGetBean(Class<T> beanClass, Object... constructorArgs);
    <T> Optional<T> findBean(Class<T> requiredType);
    <T> Optional<T> findBean(Class<T> requiredType, Predicate<T> predicate);
    boolean containsBean(Class<?> beanClass);
    boolean noContainsBean(Class<?> beanClass);
    <T> T getBeanByQualifier(Class<T> requiredType) throws BeansException;
    <T> T getBeanByQualifier(String qualifier, Class<T> requiredType) throws BeansException;
    // END EXTENDED METHOD CONTEXT

    // BEGIN GENERIC CONTEXT
    <T> void registerBean(Class<T> beanClass, Object... constructorArgs);
    <T> void registerBean(@Nullable String beanName, Class<T> beanClass, Object... constructorArgs);
    <T> void registerBean(@Nullable String beanName, Class<T> beanClass, @Nullable Supplier<T> supplier, BeanDefinitionCustomizer... customizers);

    void refreshForAotProcessing(RuntimeHints runtimeHints);
    DefaultListableBeanFactory getDefaultListableBeanFactory();

    default <T> void registerBean(Class<T> beanClass, BeanDefinitionCustomizer... customizers) {
        registerBean(null, beanClass, null, customizers);
    }

    default <T> void registerBean(@Nullable String beanName, Class<T> beanClass, BeanDefinitionCustomizer... customizers) {
        registerBean(beanName, beanClass, null, customizers);
    }

    default <T> void registerBean(Class<T> beanClass, Supplier<T> supplier, BeanDefinitionCustomizer... customizers) {
        registerBean(null, beanClass, supplier, customizers);
    }

    // END GENERIC CONTEXT
}
