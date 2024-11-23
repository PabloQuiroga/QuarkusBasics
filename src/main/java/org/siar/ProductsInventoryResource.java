package org.siar;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.siar.services.ProductInventoryService;

@Path("/products")
public class ProductsInventoryResource {

    @Inject
    ProductInventoryService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Products inventory is up!";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("KE180")
    public Response inventory() {
        var result = service.getBySku("KE180");
        return Response.ok(result).build();
    }
}
