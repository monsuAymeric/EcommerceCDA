package io.ski.api.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private long id;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_ref", referencedColumnName = "id_ref")
    private Reference reference;

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

    /**
     * return the product's reference
     * 
     * @return the product's reference
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * set the product's reference
     * 
     * @param reference the product's reference to set
     */
    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
