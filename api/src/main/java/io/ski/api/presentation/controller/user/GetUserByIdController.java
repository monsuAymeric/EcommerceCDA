package io.ski.api.presentation.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.ski.api.business.dto.UserDto;
import io.ski.api.business.service.user.IUserService;

public class GetUserByIdController {
    private IUserService userService;

    /**
     * Injects the user service.
     * 
     * @param userService the user service
     */
    @Autowired
    public GetUserByIdController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user with the given id.
     * 
     * @param id the id of the user
     * @return the user with the given id
     */
    @GetMapping("/users/{id}")
    public UserDto getUserById(final @PathVariable Long id) {
        return userService.getUserById(id);
    }
}