package io.ski.api.persistance.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "refs")
public class Reference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ref")
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "color", nullable = false, length = 25)
    private String color;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;

    /**
     * Return the reference's id
     * 
     * @return the reference's id
     */
    public long getId() {
        return id;
    }

    /**
     * Set the reference's id
     * 
     * @param id the reference's id to set
     */
    public void setId(final long id) {
        this.id = id;
    }

    /**
     * Return the reference's name
     * 
     * @return the reference's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the reference's name
     * 
     * @param name the reference's name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * return the reference's price
     * 
     * @return the reference's price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the reference's price
     * 
     * @param price the reference's price
     */
    public void setPrice(final double price) {
        this.price = price;
    }

    /**
     * return the reference's color
     * 
     * @return the reference's color
     */
    public String getColor() {
        return color;
    }

    /**
     * set the reference's color
     * 
     * @param color the reference color to set
     */
    public void setColor(final String color) {
        this.color = color;
    }

    /**
     * return the reference's description
     * 
     * @return the reference description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the reference's description
     * 
     * @param description reference's description to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Return the reference's products
     * 
     * @return the reference's products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Set the reference's products
     * 
     * @param products the reference's products to set
     */
    public void setProducts(final List<Product> products) {
        this.products = products;
    }
}
