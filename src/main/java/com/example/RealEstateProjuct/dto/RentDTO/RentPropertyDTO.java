package com.example.RealEstateProjuct.dto.RentDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RentPropertyDTO {

    private Long id;
    private String title;
    private String propertyType; // FLAT / PG / COMMERCIAL
    private CategoryDTO category;
    private UserDTO owner;
    private RentPriceDTO rentPrice;
    private AreaDTO area;
    private Integer bedrooms;
    private Integer bathrooms;
    private AddressDTO address;
    private boolean isVerified;
    private String featuresSummary;
    private List<ImageDTO> images;
    private Set<AmenityDTO> amenities;
    private Set<String> tags;

    private RentFlatDetailsDTO flatDetails;
    private RentPGDetailsDTO pgDetails;
    private RentCommercialDetailsDTO commercialDetails;

    private Instant createdAt;
    private Instant updatedAt;

}
