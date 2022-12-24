package resource;

import org.approximation.ApproximationService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/approximation")
public class ApproximationResource {

    @GET
    @Path("{numberOfIterations}")
    @Produces(MediaType.TEXT_PLAIN)
    public String draw(@PathParam("numberOfIterations") int numberOfIterations) {
        return ApproximationService.run(numberOfIterations);
    }
}
