package com.example.inventoryservice.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public List<InventoryEntity> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public InventoryEntity getInventoryByProductId(String productId) {
        return inventoryRepository.findById(productId).orElse(null);
    }

    public InventoryEntity updateInventory(String productId, int quantity) {
        InventoryEntity inventory = inventoryRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        inventory.setQuantity(quantity);
        return inventoryRepository.save(inventory);
    }
}
