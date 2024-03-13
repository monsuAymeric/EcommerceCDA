package io.ski.api.business.service.cart;

import io.ski.api.business.dto.CartDto;

public interface ICartService {

    /**
     * Saves a cart in the database.
     *
     * @param cart the user to save
     */
    void createCart(final CartDto cart);

    /**
     * Returns the cart with the given id.
     *
     * @param id the id of the cart
     * @return the cart with the given id
     */
    CartDto getByUserCart(final long id);

    /**
     * Modifies the cart.
     *
     * @param cart the cart to modify
     */
    void modifyCart(final CartDto cart);

    /**
     * Deletes the cart with the given id.
     *
     * @param id the id of the cart
     */
    void deleteCart(final long id);
}