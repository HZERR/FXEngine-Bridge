package ru.hzerr.fx.engine.core.interfaces.engine;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

public interface IFXEnvironment {

    Stage getStage();
    Window getWindow();
    Scene getScene();
}
