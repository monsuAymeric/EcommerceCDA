package io.ski.api.presentation.controller.product;

import io.ski.api.business.dto.ProductDto;
import io.ski.api.business.service.product.IProductService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GetByRefProductController {
    private IProductService productService;

    /**
     * Injects the product service.
     *
     * @param productService the product service
     */
    public GetByRefProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{reference}")
    public ProductDto getByRefProduct(final @PathVariable long reference) {
        return productService.getByRefProduct(reference);
    }
}