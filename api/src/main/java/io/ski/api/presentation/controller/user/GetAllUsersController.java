package io.ski.api.presentation.controller.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import io.ski.api.business.dto.UserDto;
import io.ski.api.business.service.user.IUserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAllUsersController {
    private IUserService userService;

    /**
     * Injects the user service.
     * 
     * @param userService the user service
     */
    public GetAllUsersController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * Gets all users.
     * 
     * @return a list of all users
     */
    @GetMapping("/users")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }
}