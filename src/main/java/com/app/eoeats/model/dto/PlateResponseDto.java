package com.app.eoeats.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
public class PlateResponseDto {

    private final String id;
    private final int type;
    private final String name;
    private final double price;
    private final String categoryId;
    // private final List<AllergenResponseDto> allergensList;
    private final boolean isAvailable;
    private final boolean isKitchenPrinter;
    private final String description;


}
