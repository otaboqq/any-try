import com.google.inject.Binder;
import com.google.inject.Module;
import io.airlift.discovery.server.ServiceResource;

import static io.airlift.configuration.ConfigBinder.configBinder;   // NEW LINE
import static io.airlift.jaxrs.JaxrsBinder.jaxrsBinder;
/**
 * @author zhangsx
 */
public class ServiceModule implements Module {
    @Override
    public void configure(Binder binder)
    {
        jaxrsBinder(binder).bind(ServiceResource.class);
        configBinder(binder).bindConfig(ServiceConfig.class);   // NEW LINE
    }
}
