package io.ski.api.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private long id;

    /**
     * return the product's id
     * 
     * @return the product's id
     */
    public long getId() {
        return id;
    }

    /**
     * set the product's id
     * 
     * @param id the product's id to set
     */
    public void setId(long id) {
        this.id = id;
    }
}
