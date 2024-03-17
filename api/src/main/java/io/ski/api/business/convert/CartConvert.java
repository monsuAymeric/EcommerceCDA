package io.ski.api.business.convert;

import io.ski.api.business.dto.CartDto;
import io.ski.api.business.dto.ProductDto;
import io.ski.api.persistance.entity.Cart;
import io.ski.api.persistance.entity.Product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CartConvert {
    private static CartConvert instance;
    private UserConvert userConvert = UserConvert.getInstance();
    private ProductConvert productConvert = ProductConvert.getInstance();

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
        dto.setUser(entity.getUser() != null ? userConvert.entityToDto(entity.getUser()) : null);
        Set<ProductDto> productsDto = new HashSet<>();
        for (Product product : entity.getProducts()) {
            productsDto.add(productConvert.entityToDto(product));
        }
        dto.setProducts(productsDto);
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
        entity.setUser(dto.getUser() != null ? userConvert.dtoToEntity(dto.getUser()) : null);
        Set<ProductDto> productsDto = dto.getProducts();
        Set<Product> products = new HashSet<>();
        if (productsDto != null) {
            for (ProductDto productDto : productsDto) {
                products.add(productConvert.dtoToEntity(productDto));
            }
        }
        entity.setProducts(products);
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