package org.siar;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.siar.model.ProductAvailability;
import org.siar.model.ProductInventory;

import java.math.BigDecimal;

@Path("/products")
public class ProductsInventoryResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Products inventory is up!";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/123")
    public Response getBySku() {
        ProductInventory productInventory = new ProductInventory();
        productInventory.setSku("KEO 180");
        productInventory.setName("K-Eco 180");
        productInventory.setProductAvailability(ProductAvailability.IN_STOCK);
        productInventory.setQuantity(12);
        productInventory.setPrice(BigDecimal.valueOf(315.1));
        return Response.ok(productInventory).build();
    }
}
