package org.siar.services;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@QuarkusTest
class ProductInventoryServiceTest {

    @Inject
    ProductInventoryService service;

    @Test
    public void test(){
        var result = service.getBySku("KE180");
        assertNotNull(result);
        assertEquals("K-Eco 180", result.getName());
    }
}