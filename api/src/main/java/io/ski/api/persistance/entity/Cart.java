package io.ski.api.persistance.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cart")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;

    @ManyToMany
    @JoinTable(name = "orders", joinColumns = @JoinColumn(name = "id_product"), inverseJoinColumns = @JoinColumn(name = "id_cart"))
    Set<Product> products;

    /**
     * return the cart's id.
     * 
     * @return the cart's id.
     */
    public Long getId() {
        return id;
    }

    /**
     * set the cart's id.
     * 
     * @param id the cart's id to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * return the cart's user.
     * 
     * @return the cart's user.
     */
    public User getUser() {
        return user;
    }

    /**
     * set the cart's user.
     * 
     * @param user the cart's user to set.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * return the cart's products.
     * 
     * @return the cart's products.
     */
    public Set<Product> getProducts() {
        return products;
    }

    /**
     * set the cart's products.
     * 
     * @param products the cart's products to set.
     */
    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
