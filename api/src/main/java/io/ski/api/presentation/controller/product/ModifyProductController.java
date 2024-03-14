package io.ski.api.presentation.controller.product;

import io.ski.api.business.dto.ProductDto;
import io.ski.api.business.service.product.IProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyProductController {
    private IProductService productService;

    /**
     * Injects the product service.
     *
     * @param productService the product service
     */
    public ModifyProductController(IProductService productService) {
        this.productService = productService;
    }

    /**
     * Modifies the product.
     *
     * @param product the product to modify
     */
    @PostMapping("/products/modify")
    public void modifyProduct(final ProductDto product) {
        productService.modifyProduct(product);
    }
}