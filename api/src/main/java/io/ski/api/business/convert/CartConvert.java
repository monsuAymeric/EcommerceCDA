package io.ski.api.business.convert;

import io.ski.api.business.dto.CartDto;
import io.ski.api.persistance.entity.Cart;

import java.util.ArrayList;
import java.util.List;

public class CartConvert {
    private static CartConvert instance;

    /**
     * Get the singleton instance of the class.
     *
     * @return the singleton instance of this class.
     */
    public static CartConvert getInstance() {
        if (instance == null) {
            instance = new CartConvert();
        }
        return instance;
    }

    /**
     * Convert an entity to a DTO.
     *
     * @param entity the entity to convert.
     * @return the converted DTO.
     */
    public CartDto entityToDto(final Cart entity) {
        CartDto dto = new CartDto();
        dto.setId(entity.getId());
        return dto;
    }

    /**
     * Convert a DTO to an entity.
     *
     * @param dto the dto to convert.
     * @return the converted entity.
     */
    public Cart dtoToEntity(final CartDto dto) {
        Cart entity = new Cart();
        entity.setId(dto.getId());
        return entity;
    }

    /**
     * Convert an entity list to a dto list.
     *
     * @param entityList the entity list to convert.
     * @return the converted DTO list.
     */
    public List<CartDto> entityListToDtoList(final List<Cart> entityList) {
        List<CartDto> dtoList = new ArrayList<>();
        for (Cart entity : entityList) {
            dtoList.add(entityToDto(entity));
        }
        return dtoList;
    }

    public List<Cart> dtoListToEntityList(final List<CartDto> dtoList) {
        List<Cart> entityList = new ArrayList<>();
        for (CartDto dto : dtoList) {
            entityList.add(dtoToEntity(dto));
        }
        return entityList;
    }
}