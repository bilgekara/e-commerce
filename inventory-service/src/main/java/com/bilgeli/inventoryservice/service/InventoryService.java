package com.bilgeli.inventoryservice.service;

import com.bilgeli.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String scuCode) {
        return inventoryRepository.findByScuCode(scuCode)
                .filter(inventory -> (inventory.getQuantity() > 0))
                .isPresent();

    }
}
