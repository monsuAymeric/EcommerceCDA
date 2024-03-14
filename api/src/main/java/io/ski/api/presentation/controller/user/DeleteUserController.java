package io.ski.api.presentation.controller.user;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.ski.api.business.service.user.IUserService;

@RestController
public class DeleteUserController {
    private IUserService userService;

    /**
     * Injects the user service.
     * 
     * @param userService the user service
     */
    public DeleteUserController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * Deletes the user with the given id.
     * 
     * @param id the id of the user
     */
    @DeleteMapping("/users/{id}")
    public void deleteUser(final @PathVariable long id) {
        userService.deleteUser(id);
    }
}