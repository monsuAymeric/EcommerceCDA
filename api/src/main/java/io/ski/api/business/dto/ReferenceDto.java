package io.ski.api.business.dto;

public class ReferenceDto {
    private long id;
    private String name;
    private double price;
    private String color;
    private String description;

    /**
     * Get the reference's id.
     *
     * @return the reference's id.
     */
    public long getId() {
        return id;
    }

    /**
     * Set the reference's id.
     *
     * @param id the reference's id to set.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the reference's name.
     *
     * @return the reference's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the reference's name.
     *
     * @param name the reference's name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the reference's price.
     *
     * @return the reference's price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the reference's price.
     *
     * @param price the reference's price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get the reference's color.
     *
     * @return the reference's color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Set the reference's color.
     *
     * @param color the reference's color to set.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get the reference's description.
     *
     * @return the reference's description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the reference's description.
     *
     * @param description the reference's description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}