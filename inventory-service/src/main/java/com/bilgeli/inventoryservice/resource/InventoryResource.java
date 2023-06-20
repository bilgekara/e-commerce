package com.bilgeli.inventoryservice.resource;

import com.bilgeli.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inventory")
@RequiredArgsConstructor
public class InventoryResource {
    private final InventoryService inventoryService;

    @GetMapping("/{scu-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("scu-code") String scuCode){
        return inventoryService.isInStock(scuCode);
    }
}
