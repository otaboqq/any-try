import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author zhangsx
 */
@Path("/v1/service")
public class ServiceResource {
    private final ServiceConfig config; // NEW

    @Inject                                         // NEW
    public ServiceResource(ServiceConfig config)    // NEW
    {                                               // NEW
        this.config = config;                       // NEW
    }                                               // NEW

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello()
    {
        return config.getHelloMessage();            // CHANGED
    }
}
