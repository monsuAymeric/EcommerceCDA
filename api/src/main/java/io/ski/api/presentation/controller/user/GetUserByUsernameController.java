package io.ski.api.presentation.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.ski.api.business.dto.UserDto;
import io.ski.api.business.service.user.IUserService;

public class GetUserByUsernameController {
    private IUserService userService;

    /**
     * Injects the user service.
     * 
     * @param userService the user service
     */
    @Autowired
    public GetUserByUsernameController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the users with the given username.
     * 
     * @param username the username of the users
     * @return the users with the given username
     */
    @GetMapping("/users/{username}")
    public List<UserDto> getUserById(final @PathVariable String username) {
        return userService.getUserByUsername(username);
    }
}