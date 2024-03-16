package io.ski.api.presentation.controller.authentification;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import io.ski.api.business.dto.UserDto;
import io.ski.api.business.service.user.IUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin
public class LoginController {
    private IUserService userService;

    /**
     * Injects the user service.
     * @param userService the user service
     */
    public LoginController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public String login(@RequestBody UserDto user) {
        final String status = userService.login(user.getEmail(), user.getPassword());        
        return status;
    }
    
}
