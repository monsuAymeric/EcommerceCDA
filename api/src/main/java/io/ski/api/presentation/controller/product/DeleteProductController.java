package io.ski.api.presentation.controller.product;

import io.ski.api.business.service.product.IProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteProductController {
    private IProductService productService;

    /**
     * Injects the product service.
     * @param productService the product service
     */
    public DeleteProductController(IProductService productService) {
        this.productService = productService;
    }

    /**
     * Deletes the product with the given id.
     * @param id the id of the product
     */
    @DeleteMapping("/products/{id}")
    public void deleteProduct(final @PathVariable long id) {
        productService.deleteProduct(id);
    }
}