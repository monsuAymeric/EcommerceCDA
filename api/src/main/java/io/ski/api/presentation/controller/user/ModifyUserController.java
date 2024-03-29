package io.ski.api.presentation.controller.user;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.ski.api.business.dto.UserDto;
import io.ski.api.business.service.user.IUserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ModifyUserController {
    private IUserService userService;

    /**
     * Injects the user service.
     * 
     * @param userService the user service
     */
    public ModifyUserController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * Modifies the user.
     * 
     * @param user the user to modify
     */
    @PutMapping("/users")
    public void modifyUser(final @RequestBody UserDto user) {
        userService.modifyUser(user);
    }
}