package com.newtondev.inventoryservice.service;

import com.newtondev.inventoryservice.model.InventoryRecord;

import java.util.Optional;

public interface InventoryService {

    Optional<InventoryRecord> getInventoryRecord(Integer productId);

    Optional<InventoryRecord> purchaseProduct(Integer productId, Integer quantity);

}
