### Подключение библиотеки
```java
<repositories>
	<repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.HZERR</groupId>
    <artifactId>FXEngine-Bridge</artifactId>
    <version>1.0</version>
</dependency>
```

### Дополнительно
Библиотеки не поставляются вместе с FXEngine-Bridge. Вы должны сами добавить их в свой проект при необходимости

1. [Spring Context 6.1.6](https://mvnrepository.com/artifact/org.springframework/spring-context)
2. [TypeSafe Config 1.4.3](https://mvnrepository.com/artifact/com.typesafe/config)
3. [SLF4J API 2.1.0-alpha1](https://mvnrepository.com/artifact/org.slf4j/slf4j-api)
4. [Logback Classic 1.5.3](https://mvnrepository.com/artifact/ch.qos.logback/logback-classic)
5. [CommonInstruments-JDK17 1.4.2.2](https://jitpack.io/#HZERR/CommonInstruments-JDK17/1.4.2.2)

### Пример использования

```java
import ru.hzerr.capmonster.request.ImageToTextRequest;
import ru.hzerr.capmonster.response.Response;
import ru.hzerr.capmonster.response.impl.ImageToTextData;
import ru.hzerr.fx.engine.core.annotation.Include;
import ru.hzerr.fx.engine.core.annotation.RegisteredPrototype;
import ru.hzerr.fx.engine.core.annotation.metadata.EngineLogProvider;
import ru.hzerr.fx.engine.core.interfaces.logging.ILogProvider;

@RegisteredPrototype
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
