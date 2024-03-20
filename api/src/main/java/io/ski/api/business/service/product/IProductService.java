package io.ski.api.business.service.product;

import io.ski.api.business.dto.ProductDto;

import java.util.List;

public interface IProductService {

    /**
     * Saves a product in the database.
     *
     * @param product the product to save.
     */
    void createProduct(final ProductDto product);

    /**
     * Returns all products in the database.
     *
     * @return all products in the database.
     */
    List<ProductDto> getAllProduct();

    /**
     * Returns the product with the given id.
     *
     * @param id the id of the product
     * @return the product with the given id
     */
    ProductDto getByIdProduct(final long id);

    /**
     * Modifies the product.
     *
     * @param product the product to modify
     */
    void modifyProduct(final ProductDto product);

    /**
     * Deletes the product with the given id.
     *
     * @param id the id of the product
     */
    void deleteProduct(final long id);
}