package tsm.mobop.project.acf.server;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/thomas")
public class HelloWorldService {
    @GET
    @Path("/{param}")
    public Response getMessage(@PathParam("param") String message) {
        String output = "Jersey says " + message;
        return Response.status(200).entity(output).build();
    }
}