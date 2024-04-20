package ru.hzerr.fx.engine.core.interfaces.entity;

import javafx.stage.Popup;

public interface IPopupController extends IController, Viewable {

    Popup getPopup();
}
