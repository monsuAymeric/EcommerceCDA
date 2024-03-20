package io.ski.api.business.dto;

public class ProductDto {
    private long id;

    /**
     * Get the product's id
     *
     * @return the product's id
     */
    public long getId() {
        return id;
    }

    /**
     * Set the product's id
     *
     * @param id the product's id to set
     */
    public void setId(final long id) {
        this.id = id;
    }
}