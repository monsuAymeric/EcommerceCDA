package io.ski.api.business.dto;

import java.util.Set;

public class CartDto {

    private long id;
    private UserDto user;
    private Set<ProductDto> products;

    /**
     * Get the cart's id.
     *
     * @return the cart's id.
     */
    public long getId() {
        return id;
    }

    /**
     * Set the cart's id.
     *
     * @param id the cart's id to set.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the cart's user.
     *
     * @return the cart's user.
     */
    public UserDto getUser() {
        return user;
    }

    /**
     * Set the cart's user.
     *
     * @param user the cart's user to set.
     */
    public void setUser(UserDto user) {
        this.user = user;
    }

    /**
     * Get the cart's products.
     */
    public Set<ProductDto> getProducts() {
        return products;
    }

    /**
     * Set the cart's products.
     *
     * @param products the cart's products to set.
     */
    public void setProducts(Set<ProductDto> products) {
        this.products = products;
    }
}
