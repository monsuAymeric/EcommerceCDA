package io.ski.api.business.convert;

import io.ski.api.business.dto.ReferenceDto;
import io.ski.api.persistance.entity.Reference;

import java.util.ArrayList;
import java.util.List;

public class ReferenceConvert {

    private static ReferenceConvert instance;
    private ProductConvert productConvert = ProductConvert.getInstance();

    /**
     * Get the singleton instance of this class.
     *
     * @return the singleton instance of this class.
     */
    public static ReferenceConvert getInstance() {
        if (instance == null) {
            instance = new ReferenceConvert();
        }
        return instance;
    }

    /**
     * Convert an entity to a DTO.
     *
     * @param entity the entity to convert.
     * @return the converted DTO.
     */
    public ReferenceDto entityToDto(final Reference entity) {
        ReferenceDto dto = new ReferenceDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setColor(entity.getColor());
        dto.setPrice(entity.getPrice());
        dto.setDescription(entity.getDescription());
        dto.setProducts(entity.getProducts() != null ? productConvert.entityListToDtoList(entity.getProducts()) : null);
        return dto;
    }

    /**
     * Convert a DTO to an entity.
     *
     * @param dto the DTO to convert.
     * @return the converted entity.
     */
    public Reference dtoToEntity(final ReferenceDto dto) {
        Reference entity = new Reference();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setColor(dto.getColor());
        entity.setPrice(dto.getPrice());
        entity.setDescription(dto.getDescription());
        entity.setProducts(dto.getProducts() != null ? productConvert.dtoListToEntityList(dto.getProducts()) : null);
        return entity;
    }

    /**
     * Convert an entity list to a DTO list.
     *
     * @param entityList the entity list to convert.
     * @return the converted DTO list.
     */
    public List<ReferenceDto> entityListToDtoList(final List<Reference> entityList) {
        List<ReferenceDto> dtoList = new ArrayList<>();
        for (Reference entity : entityList) {
            dtoList.add(entityToDto(entity));
        }
        return dtoList;
    }

    /**
     * Convert a DTO list to an entity list.
     *
     * @param dtoList the dto list to convert.
     * @return the converted entity list.
     */
    public List<Reference> dtoListToEntityList(final List<ReferenceDto> dtoList) {
        List<Reference> entityList = new ArrayList<>();
        for (ReferenceDto dto : dtoList) {
            entityList.add(dtoToEntity(dto));
        }
        return entityList;
    }
}