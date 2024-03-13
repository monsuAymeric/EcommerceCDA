package io.ski.api.business.dto;

public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String email;

    /**
     * Get the user's id.
     * 
     * @return the user's id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the user's id.
     * 
     * @param id the user's id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the user's username.
     * 
     * @return the user's username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the user's username.
     * 
     * @param username the user's username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get the user's password.
     * 
     * @return the user's password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the user's password.
     * 
     * @param password the user's password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the user's email.
     * 
     * @return the user's email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the user's email.
     * 
     * @param email the user's email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}