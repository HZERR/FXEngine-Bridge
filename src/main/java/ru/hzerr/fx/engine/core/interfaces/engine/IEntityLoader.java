package ru.hzerr.fx.engine.core.interfaces.engine;

import javafx.scene.Parent;
import ru.hzerr.fx.engine.core.exception.FXMLLoadException;
import ru.hzerr.fx.engine.core.exception.LoadControllerException;
import ru.hzerr.fx.engine.core.interfaces.concurrent.IExtendedCompletionStage;
import ru.hzerr.fx.engine.core.interfaces.entity.IController;
import ru.hzerr.fx.engine.core.interfaces.entity.IEntity;
import ru.hzerr.fx.engine.core.interfaces.entity.IPopupController;
import ru.hzerr.fx.engine.core.interfaces.entity.ISpringLoadMetaData;

public interface IEntityLoader {
    <C extends IController, P extends Parent>
    IEntity<C, P> load(ISpringLoadMetaData<C> loadData, Class<P> parent) throws LoadControllerException, FXMLLoadException;
    <C extends IController, P extends Parent>
    IExtendedCompletionStage<IEntity<C, P>> loadAsync(ISpringLoadMetaData<C> loadData, Class<P> parent);
    <C extends IPopupController, P extends Parent>
    IEntity<C, P> view(ISpringLoadMetaData<C> loadData, Class<P> parent) throws LoadControllerException, FXMLLoadException;
}
