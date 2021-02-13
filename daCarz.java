package garazh;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("kars") // <-- localhost:8080/[nazevAppky]/api/kars
@Produces(MediaType.APPLICATION_JSON) // <--  nastavuji jak chci komunikovat
public class daCarz {

    @Inject
    private daGarazh daGarazh;


    @POST //add auto
    public Response addCar(daCar daCar) {
        daGarazh.daGarazhPOST(daCar);
        return Response.ok().build();
    }

    @GET //all auto
    public Response getAllCarz() {
        return Response.ok(daGarazh.daGarazhGET()).build();
    }

    @DELETE //delet auto
    public Response deletKar(@QueryParam("id") int id,daCar daCar) {
        daGarazh.daGarauhDELET(id);
        return Response.ok().build();
    }

    @PUT //upravaAut
    public Response tuneCar() {
        return Response.ok().build();
    }
}