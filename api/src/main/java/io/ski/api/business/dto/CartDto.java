package io.ski.api.business.dto;

public class CartDto {

    private long id;

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
}