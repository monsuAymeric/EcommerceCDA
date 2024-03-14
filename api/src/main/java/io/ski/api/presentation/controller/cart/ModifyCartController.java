package io.ski.api.presentation.controller.cart;

import io.ski.api.business.dto.CartDto;
import io.ski.api.business.service.cart.ICartService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyCartController {
    private ICartService cartService;

    /**
     * Injects the cart service.
     *
     * @param cartService the cart service
     */
    public ModifyCartController(ICartService cartService) {
        this.cartService = cartService;
    }

    /**
     * Modifies the cart.
     *
     * @param cart the cart to modify
     */
    @PostMapping("/cart/modify")
    public void modifyCart(final CartDto cart) {
        cartService.modifyCart(cart);
    }
}