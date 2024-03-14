package io.ski.api.presentation.controller.product;

import io.ski.api.business.dto.ProductDto;
import io.ski.api.business.service.product.IProductService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CreateProductController {
    private IProductService productService;

    /**
     * Injects the product service.
     *
     * @param productService the product service
     */
    CreateProductController(IProductService productService) {
        this.productService = productService;
    }

    /**
     * Creates a new product.
     *
     * @param product the product to create
     */
    @PostMapping("/products")
    public void createProduct(final @RequestBody ProductDto product) {
        productService.createProduct(product);
    }
}