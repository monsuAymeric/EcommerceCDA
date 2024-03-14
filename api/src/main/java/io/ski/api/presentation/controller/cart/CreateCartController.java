package io.ski.api.presentation.controller.cart;

import io.ski.api.business.dto.CartDto;
import io.ski.api.business.service.cart.ICartService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateCartController {
    private ICartService cartService;

    /**
     * Injects the cart service.
     *
     * @param cartService the cart service
     */
    public CreateCartController(ICartService cartService) {
        this.cartService = cartService;
    }

    /**
     * Creates a new cart.
     *
     * @param cart the cart to create
     */
    @PostMapping("/carts")
    public void createCart(final CartDto cart) {
        cartService.createCart(cart);
    }
}