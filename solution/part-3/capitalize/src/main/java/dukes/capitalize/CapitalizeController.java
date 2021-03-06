package dukes.capitalize;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/capitalize")
@ApplicationScoped
public class CapitalizeController {

    @GET
    @Path("/{word}")
    @RolesAllowed("protected")
    public String capitalize(@PathParam("word") String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
