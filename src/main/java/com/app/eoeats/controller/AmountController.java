package com.app.eoeats.controller;

import com.app.eoeats.model.dto.AmountOfPlatesAndExtrasDto;
import com.app.eoeats.service.AmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/amount")
@CrossOrigin(origins = {
        "https://front-eoeats.vercel.app",
        "http://localhost:8080"
})
public class AmountController {

    @Autowired
    AmountService amountService;

    @GetMapping("/{orderId}")
    private ResponseEntity<List<AmountOfPlatesAndExtrasDto>> getOrderPlatesAndExtras(@PathVariable final String orderId) {
        return ResponseEntity.ok(amountService.getPlatesAndExtrasByOrder(orderId));
    }

    @DeleteMapping("/{amountId}")
    private ResponseEntity<String> deletePlateFromOrder(@PathVariable final String amountId) {
        return ResponseEntity.ok(amountService.deleteAmountFromOrder(amountId));
    }
}
