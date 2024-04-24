# Example

```java
import ru.hzerr.capmonster.request.ImageToTextRequest;
import ru.hzerr.capmonster.response.Response;
import ru.hzerr.capmonster.response.impl.ImageToTextData;
import ru.hzerr.fx.engine.core.annotation.Include;
import ru.hzerr.fx.engine.core.annotation.RegisteredPrototype;
import ru.hzerr.fx.engine.core.annotation.metadata.EngineLogProvider;
import ru.hzerr.fx.engine.core.interfaces.logging.ILogProvider;

@Registered
public class Capmonster extends AbstractCapmonster {

    private ILogProvider logProvider;

    public Capmonster(String clientKey) {
        super(clientKey);
    }

    @Override
    public Response<ImageToTextData> send(ImageToTextRequest imageToTextRequest) {
        if (logProvider != null)
            logProvider.getLogger().debug("Отправка запроса...");

        return null;
    }

    @Include(required = false)
    public void setLogProvider(@EngineLogProvider ILogProvider logProvider) {
        this.logProvider = logProvider;
    }

    public static Capmonster from(String clientKey) {
        return new Capmonster(clientKey);
    }
}
```
