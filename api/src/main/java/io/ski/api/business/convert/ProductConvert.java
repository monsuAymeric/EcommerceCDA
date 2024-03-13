package io.ski.api.business.convert;

import io.ski.api.business.dto.ProductDto;
import io.ski.api.persistance.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductConvert {

    private static ProductConvert instance;

    /**
     * Get the singleton instance of this class.
     *
     * @return the singleton instance of this class.
     */
    public static ProductConvert getInstance() {
        if (instance == null) {
            instance = new ProductConvert();
        }
        return instance;
    }

    /**
     * Convert an entity to a DTO
     *
     * @param entity the entity to convert.
     * @return the converted DTO.
     */
    public ProductDto entityToDto(final Product entity) {
        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    /**
     * Convert a DTO to an entity
     *
     * @param dto the DTO to convert.
     * @return the converted entity.
     */
    public Product dtoToEntity(final ProductDto dto) {
        Product entity = new Product();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

    /**
     * Convert an entity List to a DTO list
     *
     * @param entityList the entity list to convert.
     * @return the converted DTO list
     */
    public List<ProductDto> entityListToDtoList(final List<Product> entityList) {
        List<ProductDto> dtoList = new ArrayList<>();
        for (Product entity : entityList) {
            dtoList.add(entityToDto(entity));
        }
        return dtoList;
    }

    /**
     * Convert a DTO list to an entity list.
     *
     * @param dtoList the DTO list to convert.
     * @return the converted entity list.
     */
    public List<Product> dtoListToEntityList(final List<ProductDto> dtoList) {
        List<Product> entityList = new ArrayList<>();
        for (ProductDto dto : dtoList) {
            entityList.add(dtoToEntity(dto));
        }
        return entityList;
    }
}
