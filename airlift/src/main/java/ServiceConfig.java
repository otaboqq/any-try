import io.airlift.configuration.Config;

import javax.validation.constraints.NotBlank;

/**
 * @author zhangsx
 */
public class ServiceConfig {
    private String helloMessage = "Hello Airlift!";

    @NotBlank
    public String getHelloMessage()
    {
        return helloMessage;
    }

    @Config("hello.message")
    public ServiceConfig setHelloMessage(String helloMessage)
    {
        this.helloMessage = helloMessage;
        return this;
    }
}
