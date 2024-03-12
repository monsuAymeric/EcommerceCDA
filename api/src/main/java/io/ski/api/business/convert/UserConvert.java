package io.ski.api.business.convert;

import java.util.ArrayList;
import java.util.List;

import io.ski.api.persistance.entity.User;

public class UserConvert {
    private static UserConvert instance;

    /**
     * Get the singleton instance of this class.
     * 
     * @return the singleton instance of this class.
     */
    public static UserConvert getInstance() {
        if (instance == null) {
            instance = new UserConvert();
        }
        return instance;
    }

    /**
     * Converts an entity to a DTO.
     * 
     * @param entity the entity to convert.
     * @return the converted DTO.
     */
    public User entityToDto(final User entity) {
        User dto = new User();
        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        dto.setEmail(entity.getEmail());
        return dto;
    }

    /**
     * Converts a DTO to an entity.
     * 
     * @param dto the DTO to convert.
     * @return the converted entity.
     */
    public User dtoToEntity(final User dto) {
        User entity = new User();
        entity.setId(dto.getId());
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setEmail(dto.getEmail());
        return entity;
    }

    /**
     * Converts an entity list to a DTO list.
     * 
     * @param entityList the entity list to convert.
     * @return the converted DTO list.
     */
    public List<User> entityListToDtoList(final List<User> entityList) {
        List<User> dtoList = new ArrayList<>();
        for (User entity : entityList) {
            dtoList.add(entityToDto(entity));
        }
        return dtoList;
    }

    /**
     * Converts a DTO list to an entity list.
     * 
     * @param dtoList the DTO list to convert.
     * @return the converted entity list.
     */
    public List<User> dtoListToEntityList(final List<User> dtoList) {
        List<User> entityList = new ArrayList<>();
        for (User dto : dtoList) {
            entityList.add(dtoToEntity(dto));
        }
        return entityList;
    }
}
