package org.siar;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.siar.model.ProductInventory;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class ProductsInventoryResourceTest {

    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/products")
          .then()
             .statusCode(200)
             .body(is("Products inventory is up!"));
    }

    @Test
    void testInventory() {
        var result = given()
                .when().get("/products/KE180")
                .then()
                .statusCode(200)
                .extract()
                .body().as(ProductInventory.class);

        assertEquals("K-Eco 180", result.getName());
    }

}