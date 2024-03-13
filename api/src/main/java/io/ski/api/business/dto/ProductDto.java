package io.ski.api.business.dto;

public class ProductDto {
    private long id;
    private String name;

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
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the product's name
     *
     * @return the product's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the product's name
     *
     * @param name the product's name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}