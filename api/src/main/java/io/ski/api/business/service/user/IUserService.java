package io.ski.api.business.service.user;

import java.util.List;

import io.ski.api.business.dto.UserDto;

public interface IUserService {

    /**
     * Saves a user in the database.
     * 
     * @param user the user to save
     */
    void createUser(final UserDto user);

    /**
     * Returns all users in the database.
     * 
     * @return all users in the database
     */
    List<UserDto> getAllUsers();

    /**
     * Returns the user with the given id.
     * 
     * @param id the id of the user
     * @return the user with the given id
     */
    UserDto getUserById(final Long id);

    /**
     * Returns the users with the given username.
     * 
     * @param username the username of the user
     * @return the users with the given username
     */
    List<UserDto> getUserByUsername(final String username);

    /**
     * Modifies the user.
     * 
     * @param user the user to modify
     */
    void modifyUser(final UserDto user);

    /**
     * Deletes the user with the given id.
     * 
     * @param id the id of the user
     */
    void deleteUser(final Long id);
}