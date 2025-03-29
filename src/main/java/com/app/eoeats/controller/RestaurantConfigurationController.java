package com.app.eoeats.controller;

import com.app.eoeats.model.dto.RestaurantConfigurationDto;
import com.app.eoeats.service.RestaurantConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurantConfiguration")
@CrossOrigin(origins = {
        "https://your-vercel-app.vercel.app",
        "http://localhost:8080"
})
public class RestaurantConfigurationController {

    @Autowired
    private RestaurantConfigurationService restaurantConfigurationService;

    @PutMapping
    private ResponseEntity<RestaurantConfigurationDto> updateRestaurantConfiguration(@RequestBody RestaurantConfigurationDto restaurantConfigurationDto) {
        return ResponseEntity.ok(restaurantConfigurationService.updateConfiguration(restaurantConfigurationDto));
    }
}
