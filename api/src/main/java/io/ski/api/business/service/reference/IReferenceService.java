package io.ski.api.business.service.reference;

import io.ski.api.business.dto.ProductDto;
import io.ski.api.business.dto.ReferenceDto;

import java.util.List;

public interface IReferenceService {

    /**
     * Save a reference in the database.
     *
     * @param reference the reference to save.
     */
    void createReference(final ReferenceDto reference);

    /**
     * Return all references in the database.
     * .
     * 
     * @return all references in the database.
     */
    List<ReferenceDto> getAllReferences();

    /**
     * Return the reference with the given id.
     *
     * @param id the id of the reference.
     * @return the reference with the given id
     */
    ReferenceDto getByIdReference(final Long id);

    /**
     * Return the reference with the given name
     *
     * @param name the name of the reference
     * @return the reference with the given name
     */
    List<ReferenceDto> getByNameReference(final String name);

    /**
     * Modifies the reference
     *
     * @param reference the reference to modify
     */
    void modifyReference(final ReferenceDto reference);

    /**
     * Delete the reference with the given id
     *
     * @param id the id of the reference
     */
    void deleteReference(final long id);

    /**
     * Return the reference corresponding to the product.
     * 
     * @param product the product
     * @return the reference corresponding to the product.
     */
    ReferenceDto getByProduct(final ProductDto product);
}