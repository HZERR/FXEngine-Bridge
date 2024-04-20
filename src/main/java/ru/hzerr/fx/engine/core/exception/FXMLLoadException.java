package ru.hzerr.fx.engine.core.exception;

import java.io.IOException;

public class FXMLLoadException extends IOException {

    public FXMLLoadException(String message) { super(message);}
    public FXMLLoadException(String message, Throwable cause) {
        super(message, cause);
    }

    public FXMLLoadException(Throwable cause) {
        super(cause);
    }
}
