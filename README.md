# Example

```java
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
