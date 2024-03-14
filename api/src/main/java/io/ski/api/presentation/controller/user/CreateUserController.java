package io.ski.api.presentation.controller.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ski.api.business.dto.UserDto;
import io.ski.api.business.service.user.IUserService;

@RestController
public class CreateUserController {
    private IUserService userService;

    /**
     * Injects the user service.
     * 
     * @param userService the user service
     */
    public CreateUserController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * Creates a new user.
     * 
     * @param user the user to create
     */
    @PostMapping("/users")
    public void createUser(final UserDto user) {
        userService.createUser(user);
    }
}