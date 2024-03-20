
package io.ski.api.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;

    @Column(name = "username", nullable = false, length = 30)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    /**
     * Returns the user's id.
     * 
     * @return the user's id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the user's id.
     * 
     * @param id the user's id to set
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * Returns the user's username.
     * 
     * @return the user's username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the user's username.
     * 
     * @param username the user's username to set
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * Returns the user's password.
     * 
     * @return the user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the user's password.
     * 
     * @param password the user's password to set
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * Returns the user's email.
     * 
     * @return the user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user's email.
     * 
     * @param email the user's email to set
     */
    public void setEmail(final String email) {
        this.email = email;
    }
}
