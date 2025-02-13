package com.app.eoeats.service.mapper;

import com.app.eoeats.model.Category;
import com.app.eoeats.model.Plate;
import com.app.eoeats.model.dto.PlateDto;
import com.app.eoeats.model.dto.PlateResponseDto;
import com.app.eoeats.model.dto.PlateWithExtrasResponseDto;
import com.app.eoeats.service.AllergenService;
import com.app.eoeats.service.CategoryService;
import com.app.eoeats.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlateMapper {


    @Autowired
    private CategoryService categoryService;

    @Autowired
    private AllergenService allergenService;

    @Autowired
    private AllergenMapper allergenMapper;

    @Autowired
    private AllergernsResponseMapper allergernsResponseMapper;

    @Autowired
    private ExtrasResponseMapper extrasResponseMapper;

    @Autowired
    private Utils utils;


    public Plate requestDtoToEntity(final PlateDto plateDto) {
        Plate plate = new Plate();
        if (plateDto.getId() != null) {
            plate.setId(utils.stringToUuid(plateDto.getId()));
        }
        plate.setType(plateDto.getType());
        plate.setImage(plateDto.getImage());
        plate.setName(plateDto.getName());
        plate.setPrice(plateDto.getPrice());
        Category category = categoryService.findCategoryById(plateDto.getCategoryId());
        plate.setCategory(category);
        plate.setDescription(plateDto.getDescription());
        //List<Allergen> allergens = allergenService.findAllergensById(plateDto.getAllergens());
        //plate.setAllergens(allergens);
        plate.setAvailable(plateDto.isAvailable());
        plate.setKitchenPrinter(plateDto.isKitchenPrinter());

        return plate;
    }

    public PlateResponseDto entityToDto(final Plate plate) {
        return PlateResponseDto.builder()
                .id(plate.getId().toString())
                .type(plate.getType())
                .name(plate.getName())
                .price(plate.getPrice())
                .categoryId(plate.getCategory().getId().toString())
                //.allergensList(allergenMapper.entityToDto(plate.getAllergens()))
                .isAvailable(plate.isAvailable())
                .isKitchenPrinter(plate.isKitchenPrinter())
                .description(plate.getDescription())
                .build();
    }

    public PlateWithExtrasResponseDto entityToResponseDto(final Plate plate) {
        return PlateWithExtrasResponseDto.builder()
                .id(plate.getId().toString())
                .type(plate.getType())
                .name(plate.getName())
                .image(plate.getImage())
                .price(plate.getPrice())
                .isAvailable(plate.isAvailable())
                .isKitchenPrinter(plate.isKitchenPrinter())
                .description(plate.getDescription())
                .allergens(allergernsResponseMapper.entityListToListResponseDto(plate.getAllergens()))
                .extras(extrasResponseMapper.entityListToResponseDtoList(plate.getExtras()))
                .build();
    }


}
