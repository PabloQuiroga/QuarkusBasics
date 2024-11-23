package org.siar.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.siar.model.ProductAvailability;
import org.siar.model.ProductInventory;

import java.math.BigDecimal;

@ApplicationScoped
public class ProductInventoryService  {

    public ProductInventory getBySku(String sku){
        ProductInventory productInventory = new ProductInventory();
        productInventory.setSku(sku);
        productInventory.setName("K-Eco 180");
        productInventory.setProductAvailability(ProductAvailability.IN_STOCK);
        productInventory.setQuantity(12);
        productInventory.setPrice(BigDecimal.valueOf(315.1));
        return productInventory;
    }
}
