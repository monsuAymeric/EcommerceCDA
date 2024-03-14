package io.ski.api.presentation.controller.cart;

import io.ski.api.business.dto.CartDto;
import io.ski.api.business.service.cart.ICartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetByUserCartController {
    private ICartService cartService;

    /**
     * Injects the cart service.
     *
     * @param cartService the cart service
     */
    public GetByUserCartController(ICartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/cart/{id}")
    public CartDto getByUserCart(final @PathVariable Long id) {
        return cartService.getByUserCart(id);
    }
}