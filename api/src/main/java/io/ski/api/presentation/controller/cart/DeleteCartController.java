package io.ski.api.presentation.controller.cart;

import io.ski.api.business.service.cart.ICartService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DeleteCartController {
    private ICartService cartService;

    /**
     * Injects the cart service.
     * 
     * @param cartService the cart service
     */
    DeleteCartController(ICartService cartService) {
        this.cartService = cartService;
    }

    /**
     * Deletes the cart with the given id.
     * 
     * @param id the id of the cart
     */
    @DeleteMapping("/carts/{id}")
    public void deleteCart(final @PathVariable long id) {
        cartService.deleteCart(id);
    }
}