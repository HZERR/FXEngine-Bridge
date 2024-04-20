package ru.hzerr.fx.engine.core.interfaces.entity;

import javafx.beans.property.BooleanProperty;
import javafx.scene.Parent;
import ru.hzerr.fx.engine.core.annotation.FXEntity;

public interface IController {

    void initialize() throws Exception;
    void onDestroy();

    FXEntity getMetaData();

    <T extends Parent> T getContent(Class<T> cls);
    Parent getContentAsParent();

    BooleanProperty destroyProperty();
    boolean isDestroy();
}
