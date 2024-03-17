package io.ski.api.presentation.controller.cart;

import io.ski.api.business.dto.CartDto;
import io.ski.api.business.service.cart.ICartService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
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
    @PutMapping("/carts")
    public CartDto modifyCart(final @RequestBody CartDto cart) {
        return cartService.modifyCart(cart);
    }
}